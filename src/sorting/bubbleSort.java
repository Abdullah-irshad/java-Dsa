package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr [] = {4,2,5,6,1,3,-1,9,7,2};
        int[] arr2 ={};
        sort(arr2);
//        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int length = arr.length;

        for (int i=0;i<length;i++){
            boolean swapped = false;
            for (int j=1;j<length-i;j++){
             if (arr[j-1] > arr[j]){
                 swap(arr,j-1,j);
                 swapped = true;
             }
            }
            if (!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
}
