package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int a[] = {2,8,15,18,19,20};
//        int b[] = {5,9,12,17};
//        System.out.println(Arrays.toString(merge(a,b)));

        int []arr = {22,18,-1,22,19,6,2,5,};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] a, int[] b){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[a.length+b.length];

        while(i< a.length && j<b.length){
            if (a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                k++;
                j++;
            }
        }

        for (;i<a.length;i++){
            c[k++] = a[i];
        }

        for (;j<b.length;j++){
            c[k++] = b[j];
        }
        return c;
    }

}
