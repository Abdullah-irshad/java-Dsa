package array;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortHigh(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int low =0;
        int mid =0;
        int high = arr.length-1;
        while(mid<=high){
            if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
        }
    }

    static void sortHigh(int[] arr){
        int low =0;
        int mid =0;
        int high = arr.length-1;
        while(high >= mid){
            int ele = arr[high];

            if (ele == 0){
                swap(arr,high,low);
                low++;
            } else if (ele == 1) {
                swap(arr,mid,high);
                mid++;
            }else if (ele == 2){
                high--;
            }

        }
    }
    static void swap(int[] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
