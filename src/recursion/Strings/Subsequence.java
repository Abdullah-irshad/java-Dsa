package recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
//        printSub("abc","");
//        System.out.println(subsequence("abc",""));
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> list = subsequence(arr);
        for (ArrayList<Integer> l : list){
            System.out.println(l);
        }
    }
    static void printSub(String str, String p){
        if (str.isEmpty()){
            System.out.println(p);
            return;
        }
        char  ch = str.charAt(0);
        printSub(str.substring(1),p+ch);
        printSub(str.substring(1),p);
    }
    static ArrayList<String> subsequence(String str,String p){
        if (str.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsequence(str.substring(1),p);
        ArrayList<String> right = subsequence(str.substring(1),p+ch);
        left.addAll(right);
        return left;
    }
    static ArrayList<ArrayList<Integer>> subsequence(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());

        for (int ele : arr){
            int n = outer.size();
            for (int i=0;i<n;i++){
                ArrayList<Integer> list = new ArrayList<>(outer.get(i));
                list.add(ele);
                outer.add(list);
            }
        }
        return outer;
    }
}
