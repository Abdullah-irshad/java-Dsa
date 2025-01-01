package sorting;

import java.util.ArrayList;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[i] >0 && arr[i]< arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }

        for (int j=0;j<arr.length;j++){
            if (arr[j] != j+1){
                return i+1;
            }
        }
        return i+1;
    }
}
