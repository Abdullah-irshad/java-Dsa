package array;

import java.util.ArrayList;

public class UnionArray {
    public static void main(String[] args) {
        int[] a ={-8,-3,-3,-2,0,1,2,2,6};
        int [] b =  {-9,-9,0};
        System.out.println(union(a,b));
    }
    static ArrayList<Integer> union(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        int i =0;
        int j=0;
        int k=-1;
        while(i<a.length && j<b.length) {

            if (a[i] <= b[j]) {
                if (list.size() == 0){
                    list.add(a[i]);
                    k++;
                } else if ( list.get(k) != a[i]){
                    list.add(a[i]);
                    k++;
                }
                i++;
            }
            else {
                if (list.size() == 0){
                    list.add(b[j]);
                    k++;
                } else if (list.get(k) != b[j]){
                    list.add(b[j]);
                    k++;
                }
                j++;
        }
        }

        while(i< a.length){
            if (list.size() == 0){
                list.add(a[i]);
                k++;
            } else if ( list.get(k) != a[i]){
                list.add(a[i]);
                k++;
            }
            i++;
        }

        while (j<b.length){
            if (list.size() == 0){
                list.add(b[j]);
                k++;
            } else if ( list.get(k) != b[j]){
                list.add(b[j]);
                k++;
            }
            j++;
        }
        return list;
    }
}
