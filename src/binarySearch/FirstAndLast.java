package binarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int[] ans = firstAndLast(arr,7);
        System.out.println(Arrays.toString(ans));

    }
    static int[] firstAndLast(int[] arr,int target){
        int[] ans = {-1,-1};
        ans[0] = binarySearch(arr,target,true);
        ans[1] = binarySearch(arr,target,false);
        return ans;
    }

    static int binarySearch(int arr[], int target,boolean findFirst){
        int start =0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if (target < arr[mid]){
                end =  mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                ans =  mid;
                if (findFirst){
                    end = mid-1;
                }
                else {
                    start =mid+1;
                }
            }
        }
        return ans;
    }
}
