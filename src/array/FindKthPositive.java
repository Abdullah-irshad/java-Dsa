package array;

public class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositiveBetter(arr,5));
    }

    static int findKthPositiveBetter(int[] arr,int k){
        for (int ele:arr){
            if (ele <= k)k++;
            else break;
        }
        return k;
    }
    static int findKthPositiveBrute(int[] arr, int k){
        int cnt = 0;
        int ans =-1;
        int min=1;
        int max =0;
        for (int e : arr){
            max +=e;
        }
        for (int i=min;i<=max;i++){
            boolean missing = isMissing(arr,i);
            if (missing){
                cnt++;
            }
            if (cnt == k){
                ans = i;
                break;
            };
        }
        return ans;
    }
    static boolean isMissing(int[] arr, int ele){
        for (int j : arr) {
            if (j == ele) {
                return false;
            }
        }
      return true;
    }
}
