package array;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int [] arr ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    static List<List<Integer>> threeSum(int[] arr){
        HashSet<ArrayList<Integer>> hashSet= new HashSet<>();
        for (int i=0;i<arr.length;i++){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int j=i+1;j< arr.length;j++){
                int k = -(arr[i]+arr[j]);
                if (hashMap.containsKey(k)) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(k);
                    Collections.sort(list);
                    hashSet.add(list);
                }
                hashMap.put(arr[j],arr[j]);
            }
        }
        List<List<Integer>> list = new ArrayList<>(hashSet);
        return list;
    }
}
