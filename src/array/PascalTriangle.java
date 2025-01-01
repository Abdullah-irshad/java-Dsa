package array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
//        System.out.println(nCr(4,1));
        List<List<Integer>> list= new ArrayList<>();
        for (int i=1;i<=5;i++){
            list.add(printNCRRow(i));
        }
        System.out.println(list);
    }

    static ArrayList<Integer> printNCRRow(int row){
        int ans=1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i=1;i<row;i++){
            ans = ans*(row-i);
            ans= ans/i;
           list.add(ans);
        }
        return list;
    }
    static int nCr(int n, int r){
        int res = 1;
        for (int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
}
