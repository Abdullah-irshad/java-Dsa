package array;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[]arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    static int longestConsecutive(int[] arr){
        HashSet<Integer> hashSet= new HashSet<>();
        int longest =0;
        int n = arr.length;
        if (n ==0){
            return 0;
        }
        for (int j : arr) {
            hashSet.add(j);
        }

        for (int it : hashSet){
            if (!hashSet.contains(it-1)){
                int cnt =1;
                int x = it;
                while(hashSet.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }

     return longest;
    }
}
