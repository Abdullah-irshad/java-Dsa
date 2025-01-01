package binarySearch;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] ascending = {1,2,4,6,8,33,55,123,777};
        int[] descending = {1111,999,234,123,44,66,-1};
        System.out.println(binarySearch(ascending,777));
        System.out.println(binarySearch(descending,1111));
    }
    static int binarySearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while(start <= end){
            int mid = start +(end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAscending){
                if (arr[mid] < target){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if (arr[mid] < target){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
