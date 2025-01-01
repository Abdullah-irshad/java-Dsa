package Math.basic;

import java.util.ArrayList;
import java.util.List;

public class listOfDivisors {
    public static void main(String[] args) {
        listOfDivisors(12);
    }
    static void listOfDivisors(int x){

        List<Integer> list = new ArrayList<>();
        int sqrt = (int) Math.sqrt(x);
        for (int i=1;i<=sqrt;i++){
            if (x%i ==0 ){
                list.add(i);
                if (i != x/i){
                    list.add(x/i);
                }
            }
        }
        System.out.println(list);
    }
}
