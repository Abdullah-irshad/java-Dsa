package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        int[][] ans = mergeIntervals(arr);
        for (int[] row : ans){
            System.out.print(Arrays.toString(row)+" ");
        }
    }
    static int[][] mergeIntervals(int[][] arr){
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> ans = new ArrayList<>();

       for (int i =0;i< arr.length;i++){
           int start = arr[i][0];
           int end = arr[i][1];

           if (!ans.isEmpty() && ans.get(ans.size()-1)[1] >= start){
               ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],end);
           }
           else{
               ans.add(new int[]{start,end});
           }
       }
       return ans.toArray(new int[ans.size()][]);
    }
}
