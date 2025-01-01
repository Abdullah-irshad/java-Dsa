package array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithXor {
    public static void main(String[] args) {
        int [] arr = {4,2,2,6,4};
        int[] arr1 = {4,3,1,2,4};
//        System.out.println(subarrayWithXor(arr1,0));
        System.out.println(1^2);
    }

    static long subarrayWithXor(int[] arr,int k){
        long xr = 0;
        long cnt = 0;
        HashMap<Long,Long> hashMap = new HashMap<>();
        hashMap.put(0L,1L);
        for (int i=0;i<arr.length;i++){
            xr =xr^arr[i];
            long x = xr^k;
            if (hashMap.containsKey(x)){
                long count = hashMap.get(x);
                cnt +=count;
                hashMap.put(x,hashMap.get(x)+1);
            }
            else{
                hashMap.put(x, 1L);
            }
        }
        return cnt;
    }
}
