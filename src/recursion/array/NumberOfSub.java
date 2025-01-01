package recursion.array;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfSub {
    public static void main(String[] args) {
        int[] arr = {7,10,7,3,7,5,4};
//        int[] arr2 = {14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
        int target =12;
        Arrays.sort(arr);
        System.out.println(subsequence(arr,0,target,new ArrayList<>()));
    }
    static int subsequence(int[] arr, int index, int target, ArrayList<Integer> current){
        if (index == arr.length){
            if(!current.isEmpty()){
                int min =  current.get(0);
        int max = current.get(current.size()-1);
        if (min+max<=target){
            return 1;
        }
    }
            return 0;
}
        current.add(arr[index]);
                int includedCnt = subsequence(arr,index+1,target,current);

        current.remove(current.size()-1);
        int excludedCnt = subsequence(arr,index+1,target,current);
        return (includedCnt+excludedCnt) % 1_000_000_007;
    }
}
