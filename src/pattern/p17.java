package pattern;

public class p17 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int space =0;
        for (int i=0;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for (int s=0;s<space;s++){
                System.out.print(" ");
            }
            for (int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            space +=2;
            System.out.println();
        }
        space = 2*(n-1);
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int s=0;s<space;s++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            space -=2;
            System.out.println();
        }
    }
}
