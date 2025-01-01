package hash.basic;

import java.util.*;

public class CountElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2};
        count(arr);
    }
    static void count(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);
    }
}
