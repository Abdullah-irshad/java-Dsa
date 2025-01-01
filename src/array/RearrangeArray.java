package array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int [] arr = {3,1,-2,-5,2,-4};
        int [] arr1 ={-1,1};
        int [] arr2 = {-1,2,3,4,-3,1};
        rearrangeArray2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void rearrangeArray2(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            if (arr[i] < 0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }

        if (pos.size() > neg.size()){
            for (int i=0;i< neg.size();i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int index = neg.size()*2;
            for (int i= neg.size();i< pos.size();i++){
                arr[index] = pos.get(i);
                index++;
            }
        }
        else{
            for (int i=0;i<pos.size();i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int index = pos.size()*2;
            for (int i= pos.size();i< neg.size();i++){
                arr[index] = pos.get(i);
                index++;
            }
        }

    }
    static void rearrangeArray(int[] arr){
        int n = arr.length;
        int[] positive = new int[n/2];
        int[] negative= new int[n/2];

        int k=0;
        int l=0;
        for (int i=0;i<n;i++){
            if (arr[i] < 0){
                negative[k++] = arr[i];
            }else{
                positive[l++] = arr[i];
            }
        }

        for (int i=0;i<n/2;i++){
            arr[i*2] = positive[i];
            arr[i*2+1] = negative[i];
        }
    }
}
