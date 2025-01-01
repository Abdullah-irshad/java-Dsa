package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr [] = {3,5,2,1,4};
        int [] arr2 = {4,3,2,7,8,2,3,1};
        int[] arr3 = {3,4,-1,1};
        sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    static void sort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if (correctIndex >= 0 && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
