package binarySearch;

public class MRA {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int[] arr2 = {4,5,6,7,0,1,2};
        int[] arr3 = {11,13,15,17};
        System.out.println(find(arr2));
    }
    static int find(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[start] <= arr[mid]){
                min = Math.min(min,arr[start]);
                if(min == arr[start]){
                    index = start;
                }
                start = mid+1;
            }
            else {
                min = Math.min(min,arr[mid]);
                if (min == arr[mid]){
                    index = mid;
                }
                end = mid-1;
            }
        }
        System.out.println(index);
        return min;
    }
}
