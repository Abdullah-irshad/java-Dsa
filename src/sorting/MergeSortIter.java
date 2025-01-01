package sorting;

import java.util.Arrays;

public class MergeSortIter {
    public static void main(String[] args) {
        int []arr = {22,18,-1,22,19,6,2,5,};
        int [] arr1 = {5,3,2,4,1};
        long a = mergeSort(arr1,0,arr1.length-1);
        System.out.println(a);
        System.out.println(Arrays.toString(arr1));
    }
    static long mergeSort(int[] arr, int l,int r){
        long cnt =0;
        if (l >= r){
            return cnt;
        };
            int m = l + (r - l) / 2;
            cnt += mergeSort(arr, l, m);
            cnt += mergeSort(arr, m + 1, r);
            cnt += merge(arr, l, m, r);
            return cnt;
    }
    static long merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[]  L = new int[n1];
        int[] R = new int[n2];


        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr,m+1,R,0,n2);

        int i=0;
        int j=0;
        int k=l;

        long cnt =0;

        while(i<n1 && j<n2){
            if (L[i] < R[j]){
                arr[k++] = L[i++];
            }
            else {
                cnt += (m -l)+1;
                arr[k++] = R[j++];
            }
        }

        while(i<n1){
            arr[k++] = L[i++];
        }

        while(j<n2){
            arr[k++] = R[j++];
        }
        return cnt;
    }
}
