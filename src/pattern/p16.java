package pattern;

public class p16 {
    public static void main(String[] args) {
        print(5);
    }
    static  void print(int n){
        for (int i=0;i<n;i++){
            for (char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
