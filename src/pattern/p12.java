package pattern;

public class p12 {
    public static void main(String[] args) {
        print(4);
    }
    static  void print(int n){
        int space = 2 *(n-1);
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int x=1;x<=space;x++){
                System.out.print(" ");
            }
            for (int y=i;y>=1;y--){
                System.out.print(y);
            }
            System.out.println();
            space -=2;
        }
    }
}
