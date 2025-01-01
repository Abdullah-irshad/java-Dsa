package binarySearch;

import java.util.Arrays;

public class getFloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {17, 23};
        int[] arr1 = {21};
        int arr3[] = {36,82,88,56,21,17,73,86};
        int[] arr4 = {52,10,21,31,84};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(getFloorAndCeil(10,arr4)));
    }
    static int[] getFloorAndCeil(int x, int[] arr) {
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid] == x){
                int e =  arr[mid];
                return new int[]{e,e};
            }
            if (arr[mid] > x){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        int[] ans = new int[2];

        if (start > arr.length-1){
            start=-1;
        }

        if(end == -1 && start != -1){
            ans[0] = end;
            ans[1] = arr[start];
        }
        else if(end != -1 && start == -1){
            ans[0] = arr[end];
            ans[1] = start;
        }
        else if(end != -1 && start != -1){
            ans[0] = arr[end];
            ans[1] = arr[start];
        }
        else{
            ans[0] = end;
            ans[1] = start;
        }
        return ans;
    }

}
