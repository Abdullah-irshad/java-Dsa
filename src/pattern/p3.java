package pattern;

import javax.swing.*;

public class p3 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}
