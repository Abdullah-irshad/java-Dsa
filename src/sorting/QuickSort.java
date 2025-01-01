package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr = {22,18,-1,22,19,6,2,5,};
        int[] arr2 ={9999,0,1,2,3,4,5};
        quickSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void quickSort(int[] arr){
        int l=0;
        int h = arr.length-1;
        quickSortRec(arr,l,h);
    }
    static void quickSortRec(int[] arr,int l,int h){
        if (l<h){
            int p = partition(arr,l,h);
            quickSortRec(arr,l,p-1);
            quickSortRec(arr,p+1,h);
        }
    }

    static int partition(int[] arr,int l, int h){
        int pivot = arr[l];
        int i=l;
        int j=h;
        while (i<j){

            while (i<=h && arr[i] <= pivot){
                i++;
            }

            while (j>=l && arr[j]> pivot){
                j--;
            }

            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
