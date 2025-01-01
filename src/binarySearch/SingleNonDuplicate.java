package binarySearch;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4,4,8,8};
        int[] arr2 = {3,3,7,7,10,11,11};
        System.out.println(SingleNonDuplicate(arr));
        System.out.println(SingleNonDuplicate(arr2));
    }
    static int SingleNonDuplicate(int arr[]){
        int start= 0;
        int end = arr.length-1;
        if (arr.length == 1){
            return arr[0];
        }
        if (arr[start] != arr[start+1]){
            return arr[start];
        }
        if (arr[end] != arr[end-1]){
            return arr[end];
        }
        start =1;
        end = end-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
            if (mid%2==0 && arr[mid] == arr[mid+1] || mid%2 ==1 && arr[mid] == arr[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
