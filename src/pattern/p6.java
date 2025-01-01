package pattern;

public class p6 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int x=0;x<i*2+1;x++){
                System.out.print("*");
            }
            for (int y=0;y<n-i-1;y++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
