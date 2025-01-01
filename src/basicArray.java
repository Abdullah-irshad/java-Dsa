import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class basicArray {
    public static void main(String[] args) {
//        int[] arr = {1,5,6,2,8,11,};
//        System.out.println(maxNum(arr,0,4));
//        System.out.println(Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr2 = {5, 7, 7, 7, 7, 8, 8, 10};
//        System.out.println(Arrays.toString(findSE(arr2,10)));
    }

    static int maxNum(int[] arr,int start, int end){
        if (start>end){
            return -1;
        }
        if (arr.length == 0){
            return -1;
        }
        int max = arr[start];
        for (int i=0;i<=end;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void reverseArray(int[] arr){
        int start=0;
        int end =  arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static int[] findSE(int[] arr, int target){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i] != target){
                i++;
            };
           if (arr[j] != target) {
               j--;
           }
           if (arr[i] == target && arr[j] == target){
               break;
           }
        }
        if (i>j){
            return new int[]{-1,-1};
        }
        return new int[]{i,j};
    }
}
