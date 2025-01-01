package pattern;

public class p8 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        for (int i=1;i<=2*n-1;i++){
            int start =i;
            if (i>n) start = 2*n-i;
            for (int j=1;j<=start;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
