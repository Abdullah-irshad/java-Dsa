package pattern;

public class p5 {
    public static void main(String[] args) {
        print(7);
    }
    static void print(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


