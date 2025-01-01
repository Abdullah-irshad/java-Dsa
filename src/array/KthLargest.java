package array;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,9999}; // expected 5
        System.out.println(kthLargest(arr,1,0,arr.length-1));
        System.out.println(kthSmallest(arr,1,0,arr.length-1));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int kthSmallest(int[] arr,int k, int low, int high){
        int partition = partition(arr,low,high);
        if (partition == k-1){
            return arr[partition];
        }
        if(partition < k-1){
            return kthSmallest(arr,k,partition+1,high);
        }else
            return kthSmallest(arr,k,low,partition-1);
    }
    static int kthLargest(int[] arr,int k,int low, int high){

        int partition = partition(arr,low,high);
        int targetEle = arr.length - k;
        if (partition == targetEle){
            return arr[partition];
        }
        if(partition < targetEle){
            return kthLargest(arr,k,partition+1,high);
        }else
            return kthLargest(arr,k,low,partition-1);
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
//        int pivot  = arr[low];
//        int i = low+1;
//        int j = high;
//        while (i<j){
//            while(i<=high && arr[i] <= pivot){
//                i++;
//            }
//            while (j>=low && arr[j] > pivot){
//                j--;
//            }
//            if (i<j){
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,low,j);
//        return j;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
