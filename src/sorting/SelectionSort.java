package sorting;

import javax.swing.*;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {4,2,5,6,1,3,-1,9,7,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){

            int last = arr.length-i-1;
            int maxIndex = largestElement(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int last){
        int temp  = arr[first];
        arr[first] = arr[last];
        arr[last] =temp;
    }
    static int largestElement(int[] arr, int start, int end) {
        int max = start;
        for (int i =0;i<=end;i++){
            if (arr[max] < arr[i]){
                max =i;
            }
        }
        return max;
    }
}
