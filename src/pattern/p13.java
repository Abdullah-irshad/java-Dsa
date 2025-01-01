package pattern;

public class p13 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int num =1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num +=1;
            }
            System.out.println();
        }
    }
}
