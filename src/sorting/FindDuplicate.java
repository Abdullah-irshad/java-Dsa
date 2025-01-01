package sorting;
import java.util.ArrayList;
import java.util.List;

class FindDuplicate{
    public static void main(String[] args) {
        int arr[]= {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }
    static List<Integer> findDuplicate(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else{
                    list.add(arr[i]);
                   i++;
                }
            }
            else{
                i++;
            }
        }
        return list;
    }

}