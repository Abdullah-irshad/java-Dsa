package pattern;

public class p15 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }


            char ch ='A';
            int breakPoint = (i*2+1)/2;
            for (int x=1;x<=i*2+1;x++){
                System.out.print(ch);
                if (x<=breakPoint){
                    ch++;
                }
                else {
                    ch--;
                }
            }

            for (int y=0;y<n-i-1;y++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
