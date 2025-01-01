package recursion;
import java.util.ArrayList;


public class FactorialNumbers {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        System.out.println(factorialNumber(10,list,1));
    }
    static ArrayList<Long>  factorialNumber(long n, ArrayList<Long> list,long i){
        if (i > n) {
            return list;
        }

        long sum = 1;
        for (long j = 1; j <= i; j++) {
            sum *= j;
            if (sum > n) {
                return list;
            }
        }
        if (sum <= n) {
            list.add(sum);
        }
        return factorialNumber(n, list, i + 1);
    }


}
