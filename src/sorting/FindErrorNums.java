package sorting;

import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
        int[] list = new int[2];
        for (int j=0;j< arr.length;j++){
            if (arr[j] != j+1){
                list[0] = arr[j];
                list[1] = j+1;
            }
        }
        return list;
    }
}
