package array;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        System.out.println(smallestDivisor(arr,5));
    }
    static public int smallestDivisor(int[] nums, int threshold) {
        int low =1;
        int high = Integer.MIN_VALUE;
        for(int ele : nums){
            high = Math.max(ele,high);
        }
        while(low<=high){
            int mid = low +(high-low)/2;
            long sum = getSum(nums,mid);
            if(sum <= threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    static public long getSum(int[] arr, long divisor){
        long sum = 0L;
        for (int j : arr) {
            sum += (long) Math.ceil((double) j / divisor);
        }
        return sum;
    }
}
