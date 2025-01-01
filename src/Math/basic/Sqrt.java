package Math.basic;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40,3));
        System.out.println(NRM(40));
    }
    static int sqrt(int n){
        int sqrt = 1;
        for (int i=2;i*i<=n;i++){
            sqrt =i;
        }
        return sqrt;
    }
    static double sqrt(int n,int p){
        int s = 0;
        int end = n;

        double root = 0.0;
        while (s<=end){
            int m = s+(end-s)/2;
            if (m*m == n){
                return m;
            }
            if (m*m > n){
                end = m-1;
            }
            if (m*m < n){
                s = m+1;
            }
        }

        root = end;
        double incr = 0.1;
        for (int i=0;i<p;i++){
           while (root*root <=  n){
               root += incr;
           }
           root -= incr;
           incr = incr/10;
       }
        return root;
    }
    static double NRM(double n){
        double x =n;
        double root;
        while(true){
            root = 0.5 *(x+(n/x));
            if (Math.abs(root - x) < 0.2){
                break;
            }
            x = root;
        }
        return root;
    }
}
