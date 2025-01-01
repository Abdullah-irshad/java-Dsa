package recursion.array;

import java.util.*;

public class Combination2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> list = combinationSum(arr,target);
        for (List<Integer> list1: list){
            System.out.println(list1);
        }
    }

    static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,0,target,ans,new ArrayList<>());
        return  ans;
    }
    static void findCombination(int[] arr, int index, int target,List<List<Integer>> ans, ArrayList<Integer> current){
        if (target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i=index;i< arr.length;i++){
            if (i>index && arr[i] == arr[i-1])continue;
            if(arr[i] > target)break;
            current.add(arr[i]);
            findCombination(arr,i+1,target-arr[i],ans,current);
            current.remove(current.size()-1);
        }
    }
}
