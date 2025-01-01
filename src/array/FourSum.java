package array;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int arr[]= {1000000000,1000000000,1000000000,1000000000};
        int arr1[] = {1,0,-1,0,-2,2};
        int target = -294967296;
        System.out.println(fourSum(arr,target));
    }

    static public List<List<Integer>> fourSum(int[] arr, int target) {

        Set<List<Integer>> hashSet = new HashSet<>();
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j = i+1;j<n;j++){
                Set<Long> innerSet = new HashSet<>();
                for (int k=j+1;k<n;k++){
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    long l = target - sum;
                    if (innerSet.contains(l)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add((int) l);
                        Collections.sort(temp);
                        hashSet.add(temp);
                    }
                    innerSet.add((long)arr[k]);
                }
            }
        }

        return new ArrayList<>(hashSet);

    }
}
