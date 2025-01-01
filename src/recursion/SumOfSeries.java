package recursion;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(0,0L));
    }
    static long sumOfSeries(int n, Long sum){
        if (n == 0){
            return sum;
        }
        sum += (long) Math.pow(n,3);
        return sumOfSeries(n-1,sum);
    }
}
