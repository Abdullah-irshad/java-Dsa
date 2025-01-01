package pattern;

public class p7 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int x=0;x<2*n-(i*2+1);x++){
                System.out.print("*");
            }
            for (int y=0;y<i;y++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
