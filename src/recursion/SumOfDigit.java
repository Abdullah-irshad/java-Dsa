package recursion;

public class SumOfDigit {
    public static void main(String[] args) {
//        int sum = sumOfDigit(3232);
//        System.out.println(sum);
//        sample(10);
        System.out.println(countZero(11));
    }
    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumOfDigit(n/10);
    }

    static int countZero(int n){
        return helper(n,0);
    }
    static int helper(int n,int cnt){
        if(n == 0){
            return cnt;
        }
        int rem = n%10;
        if(rem ==0){
            return helper(n/10,cnt+1);
        }
        return helper(n/10,cnt);
    }
    static void sample(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        sample(n--);
        sample(--n);
    }

}
