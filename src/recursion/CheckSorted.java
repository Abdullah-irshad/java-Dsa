package recursion;

import java.util.ArrayList;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,34,4};
//        System.out.println(isSorted(arr,0));
//        System.out.println(find(arr,11,0));
        System.out.println(findTargetDuplicate(arr,4));
    }
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
    static int find(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return find(arr,target,index+1);
    }

    static ArrayList<Integer> findTargetDuplicate(int[] arr, int target){
        return helper(arr,target,0);
    }
    static ArrayList<Integer> helper(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(arr[index]);
        }
        ArrayList<Integer> returnedList = helper(arr,target,index+1);
        list.addAll(returnedList);
        return list;
    }
}
