package sorting;

import java.util.ArrayList;
import java.util.List;

public class disappearedNum {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        int [] arr2 = {1,3,4,2,2};
        System.out.println(findDisappearedNumbers(arr2));
    }
    static public List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(correct < arr.length && arr[i] != arr[correct]){
                swap(arr,correct,i);
            }  else{
                i++;
            }
        }

        for (int j=0;j< arr.length;j++){
          if (arr[j] != j+1){
              list.add(j+1);
          }
        }

//

        return list;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
