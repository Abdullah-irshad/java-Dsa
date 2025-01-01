package Math.basic;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(92727));
    }
    static boolean checkArmstrong(int x){
        int sum =0;
        int n=x;
        int power = Integer.toString(x).length();
        while (x>0){
            sum =sum+ (int) Math.pow(x%10,power);
            x =x/10;
        }
        return sum == n;
    }
}
