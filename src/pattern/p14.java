package pattern;

public class p14 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int i=0;i<n;i++){
            for (char ch='A';ch <='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
