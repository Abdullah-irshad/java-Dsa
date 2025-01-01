package Math.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(17));
    }

    static boolean primeNumber(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n%i==0){
                count++;
                if (i != n/i){
                    count++;
                }
            }
        }
        return count <= 2;
    }
}
