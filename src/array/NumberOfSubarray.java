package array;


import java.util.HashMap;

// numbers of subArrays, having sum = k;
public class NumberOfSubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int arr1[] = {1};
        System.out.println(subArrayOptimal(arr1,0));

    }

    static int subArrayOptimal(int[] arr, int k){
        int sum =0;
        int cnt =0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            int rem = sum -k;
            if (hashMap.get(rem) != null){
                cnt += hashMap.get(rem);
            }
            if (hashMap.get(sum) != null){
                hashMap.put(sum,hashMap.get(sum)+1);
            }
            else {
                hashMap.put(sum,1);
            }
        }
        return cnt;
    }
    static int subArray(int[] arr, int k){
        int cnt =0;
        for (int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if (sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
