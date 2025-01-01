package array;

import java.util.Arrays;

public class RotateKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        rotate(arr,3);
//        System.out.println(Arrays.toString(arr));
        int [] arr2 = {-1,-100,3,99};
//        rightRotate(arr2,2);
        sample(arr2,2);
        System.out.println(Arrays.toString(arr2));
    }

    /// right rotate
    static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] temp = new int[k];
        for (int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for (int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }

        for (int i=n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
    }

    static void rightRotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        int[] temp = new int[k];

        for (int i=n-k;i<n;i++){
            temp[((i+k)%n)] = arr[i];

        }

        for (int i= (n-k-1);i>=0;i--){
            arr[(i+k)] = arr[i];
        }

        for (int i=0;i<k;i++){
            arr[i] = temp[i];
        }
    }

    static void sample(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr,int i,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
