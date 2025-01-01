package binarySearch;

public class MatrixMedian {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,7,9,11},
                {2,3,4,5,10},
                {9,10,12,14,16}
        };
        System.out.println(median(matrix,matrix.length,matrix[0].length));
    }
    static int median(int matrix[][], int R, int C) {
        int low = Integer.MAX_VALUE;;
        int high = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        int req = (n*m)/2;
        for (int[] ints : matrix) {
            low = Math.min(low, ints[0]);
            high = Math.max(high, ints[m - 1]);
        }
        while(low<=high){
            int mid = low +(high - low)/2;
            int cnt = elementBefore(matrix,mid);
            if(cnt <= req){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    static int elementBefore(int[][] arr, int k){
        int cnt =0;
        for(int i=0;i<arr.length;i++){
            cnt += upperBound(arr[i],k);
        }
        return cnt;
    }
    static int upperBound(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] <= k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}
