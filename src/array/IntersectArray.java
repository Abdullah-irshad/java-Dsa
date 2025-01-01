package array;
import java.util.ArrayList;
public class IntersectArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,8};
        int[] b = {2,4,8};
//        System.out.println(intersectBrute(a,b));
//        System.out.println(intersect(a,b));
    }

    static ArrayList<Integer> intersect(int[] a, int b[]){
        ArrayList<Integer> list=  new ArrayList<>();
        int i=0;
        int j=0;

        while(i<a.length && j<b.length){
            if (a[i] < b[j]){
                i++;
            }
            else if (b[j] < a[i]){
                j++;
            }
            else {
                list.add(a[i]);
                i++;
                j++;
            }
        }
        return list;
    }
    static ArrayList<Integer> intersectBrute(int[]a,int[]b){
        ArrayList<Integer> list = new ArrayList<>();
        int[] check = new int[b.length];

        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i] == b[j] && check[j] == 0){
                    list.add(a[i]);
                    check[j] =1;
                    break;
                }
                if (b[j] > a[i]) break;
            }
        }
        return list;
    }
}
