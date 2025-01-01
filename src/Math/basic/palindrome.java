package Math.basic;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(010));
    }
    static boolean palindromeNumber(int x){
        int reverse =x;
        if (x < 0 || x%10==0){
            return false;
        }
        int rev=0;
        while(x>0){
            rev = (rev*10)+(x%10);
            x =x/10;
        }
        if (reverse == rev || reverse == rev/10){
            return true;
        }
        return false;
    }
}
