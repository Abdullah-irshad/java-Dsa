package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr []={1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        reverseArray(arr,0, arr.length-1);
    }
    static  void reverseArray(int[] arr, int s,int e){
        if (s > e){
            return;
        }
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
        reverseArray(arr,s+1,e-1);
    }
}
