package array;

import java.util.HashMap;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(lenOfLongSubarrayOptimal(arr,6));
    }

    static int lenOfLongSubarrayOptimal(int[] arr, int k){
        int left=0,right =0;
        int maxLen = 0;
        int sum = arr[0];
        int n = arr.length;
        while (right < n){

            while( left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if (sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }

            right++;
            if (right < n) sum+=arr[right];
        }


        return maxLen;
    }
    static int lenOfLongSubarray(int[] arr, int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum =0;
        int maxLen =0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            if (sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum -k;
            if (hashMap.get(rem) != null){
                int len = i - hashMap.get(rem);
                maxLen = Math.max(len,maxLen);
            }
            hashMap.putIfAbsent(sum, i);
        }
        return maxLen;
    }
}
