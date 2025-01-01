package pattern;

public class p4 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
