package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairWithMaxSum {
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 1, 6};
        int[] arr2 = {4, 3, 1, 5, 6};
        pairWithMaxSumBrute(arr2);
    }
    static void pairWithMaxSumBrute(int[] arr){
        int max = Integer.MIN_VALUE;
//        for (int i =0;i<arr.length;i++){
//            for (int j =i;j<arr.length;j++){
//                int sum = someOfMinimums(arr,i,j);
//                max = Math.max(max,sum);
//            }
//        }

        for (int i=1;i<arr.length;i++){
            int sum = arr[i] + arr[i-1];
            max = Math.max(sum,max);
        }

        System.out.println(max);
    }

    static int someOfMinimums(int[] arr, int start, int end){
        int minimum =Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        for (int i=start;i<=end;i++){
            if (arr[i] < minimum){
                secondMinimum = minimum;
                minimum = arr[i];
            }
            else if (arr[i] != minimum && arr[i] < secondMinimum){
                secondMinimum = arr[i];
            }
        }
        return minimum+secondMinimum;
    }
}
