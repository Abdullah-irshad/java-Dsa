package array;

import java.util.Arrays;

public class FindTwoElement {
    public static void main(String[] args) {
        int[] arr = {8,6,2,3,1,5,7,4,10,1};
        int[] arr2 = {3,2,5,1,7,9,10,4,6,6};
        int[] arr1 = {2,2};
        System.out.println(Arrays.toString(findTwoElement(arr2)));
    }
    static int[] findTwoElement(int arr[]) {
        int i=0;
        int n = arr.length;
        int[] ans = new int[2];
        while(i<n){
            int correctIndex = arr[i]-1;
            if(arr[i] >0 && arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j=1;j<=arr.length;j++){
         if (arr[j-1] != j+1){
             ans[0] = arr[j-1];
             ans[1] = j-1;
         }
        }

        return ans;
    }
}
