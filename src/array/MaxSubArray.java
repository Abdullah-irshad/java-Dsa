package array;

//// leetcode
public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(kadenesAlgo(arr));
    }

    static int kadenesAlgo(int [] arr){
        int maxSum = arr[0];
        int sum = 0;
        int start = -1;
        int end = -1;
        for (int i=0;i<arr.length;i++){
            if (sum == 0){
                start =i;
            }
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
                end = i;
            }
            if (sum < 0){
                sum =0;
            }
        }
        System.out.println(start+" "+end);
        return maxSum;
    }
    static public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
