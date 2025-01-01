package recursion.array;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public class SubsequenceSum {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        subsequenceSum(arr,0,2,new ArrayList<>(),0);
//        singleSequence(arr,0,2,new ArrayList<>(),0);
    }
    static void subsequenceSum(int[] arr, int index, int sum, ArrayList<Integer> current, int s){
        if(index == arr.length){
            if(s == sum){
                System.out.println(current);
            }
            return;
        }
        current.add(arr[index]);
        s += arr[index];
        subsequenceSum(arr,index+1,sum,current,s);

        current.remove(current.size()-1);
        s -= arr[index];
        subsequenceSum(arr,index+1,sum,current,s);
    }
    static boolean singleSequence(int[] arr, int index, int sum, ArrayList<Integer> current, int s){
        if(index == arr.length){
            if(s == sum){
                System.out.println(current);
                return true;
            }
            return false;
        }

        current.add(arr[index]);
        s += arr[index];
        if (singleSequence(arr, index + 1, sum, current, s)) return true;

        current.remove(current.size()-1);
        s -= arr[index];
        if (singleSequence(arr,index+1,sum,current,s)) return true;

        return false;
    }
}
