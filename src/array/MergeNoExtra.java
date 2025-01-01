package array;

import java.util.Arrays;

public class MergeNoExtra {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        merge(arr1, arr1.length, arr2,arr2.length);
        System.out.println(Arrays.toString(arr1));
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m ==0){
            nums1[0]= nums2[0];
            return;
        }
        else if(n == 0){
            return;
        }
        int len = m+n;
        int gap = (len/2)+(len%2);
        while(gap > 0){
            int left =0;
            int right = left+gap;
            while(right < len){
                if(left < n && right >= n){
                    swapIfGreater(nums1,left,nums2,right-n);
                }else if(left >=n){
                    swapIfGreater(nums1,left-n,nums2,right-n);
                }else{
                    swapIfGreater(nums1,left,nums2,right);
                }
                left++;
                right++;
            }
            if(gap == 1)break;
            gap = (gap/2)+(gap%2);
        }
        int j=0;
        for(int i=0;i<n;i++){
            nums1[j] = nums2[i];
            j++;
        }
    }

  static   public void swapIfGreater(int[] arr1, int index1, int[] arr2, int index2){
        if(arr1[index1] > arr2[index2]){
            int temp = arr1[index1];
            arr1[index1] = arr2[index2];
            arr2[index2] = temp;
        }
    }
}
