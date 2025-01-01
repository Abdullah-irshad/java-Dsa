package recursion.array;

import strings.Str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subsequence(arr,0,new ArrayList<>());

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        subsequence(arr,0,new ArrayList<>(),list);
//        for (ArrayList<Integer> list1 : list){
//            System.out.println(list1);
//        }


     }

    static void subsequence(int[] arr, int index,ArrayList<Integer> current, ArrayList<ArrayList<Integer>>list){
        if(index == arr.length){
            list.add(new ArrayList<>(current));
            return;
        }
        subsequence(arr,index+1,current,list);

        current.add(arr[index]);
        subsequence(arr,index+1,current,list);
        current.remove(current.size()-1);
    }

    static void subsequence(int[] arr,int index, ArrayList<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
//        subsequence(arr,index+1,current);
//
//        current.add(arr[index]);
//        subsequence(arr,index+1,current);
//
//        current.remove(current.size()-1);

        current.add(arr[index]);
        subsequence(arr,index+1,current);

        current.remove(current.size()-1);
        subsequence(arr,index+1,current);
    }
}
