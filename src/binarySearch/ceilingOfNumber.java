package binarySearch;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,33,55,123,777};
        int[] arr2 = {2,3,5,9,14,16,18};
        int[] arr3 = {21};
        System.out.println(ceiling(arr, -10));
        System.out.println(ceiling(arr2,15));
        System.out.println(ceiling(arr3,67));
    }
    static int ceiling(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        int ans;
        if (start <= arr.length-1){
            ans = arr[start];
        }else {
            ans =-1;
        }

        return end;
    }
}
