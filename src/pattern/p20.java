package pattern;

public class p20 {
    public static void main(String[] args) {
        print(4);
    }
    static void print(int n){
        for (int i=0;i<=2*n-1;i++){
            for (int j=0;j<2*n-1;j++){
                int top = i;
                int left =j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;
                int ans = n - Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
