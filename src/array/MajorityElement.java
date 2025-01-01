package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement{
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    static List<Integer> majorityElement(int[] arr){
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
                int value = hashMap.get(arr[i]);
                if (list.size() == 0 || list.get(0) != arr[i] && value > arr.length/3){
                    list.add(arr[i]);
                }
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
        return list;
    }
}
