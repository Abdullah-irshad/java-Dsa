package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int arr2[] = {1,0,0,5,0,0,1,2,0,4};
        int arr3[] = {4,2,4,0,0,3,0,5,1,0};
        int arr4[] = {0};
//        moveZeroes(arr3);
//        System.out.println(Arrays.toString(arr3));

        int[] num = {4,1,2,1,2};
        HashSet<Integer>  hashSet= new HashSet<>();
        for (int ele:num){
            if (hashSet.size() != 0 && hashSet.contains(ele)){
                hashSet.remove(ele);
            }
            else {
                hashSet.add(ele);
            }
        }
        int ans = hashSet.iterator().next();
        System.out.println(ans);
    }
    static  public void moveZeroes(int[] arr) {
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length){
            if (arr[i] != 0){
                i++;
            }
            if (arr[j] == 0){
                j++;
            }

            if (i == arr.length || j == arr.length){
                break;
            }

            if (i<j && arr[i] == 0 && arr[j] != 0){
                arr[i] = arr[j];
                arr[j] = 0;
            }
            else {
                if (i >= j && arr[j] != 0){
                    j++;
                }
            }
        }
    }
}
