package Math.basic;

public class GCD {
    public static void main(String[] args) {
//        System.out.println(gcd(9,12));
//        System.out.println(euclideanAlgo(11,13));
        System.out.println(lcm(9,18));
    }
    static int gcd(int n1,int n2){
        int gcd = 1;
        for (int i=Math.min(n2,n1);i >1;i--){

            if (n1%i ==0 && n2%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
    static int euclideanAlgo(int a, int b){
        while(a>0 && b>0){
            if (a > b){
                a = a%b;
            }
            else {
                b = b%a;
            }
        }
        return Math.max(a, b);
    }
    static int lcm(int a,int b){
        return a*b/euclideanAlgo(a,b);
    }
}
