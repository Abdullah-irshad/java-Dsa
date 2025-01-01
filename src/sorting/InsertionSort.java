package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {4,2,5,6,1,3,-1,9,7,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
