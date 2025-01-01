package linearSearch;

public class totalWealth {
    public static void main(String[] args) {
        int[][] accounts1 = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        System.out.println(maxWealth(accounts2));
    }
    static int maxWealth(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] row : arr){
            int sum=0;
            for (int ele : row){
                sum += ele;
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
