package array;

public class secondSmallest {
    public static void main(String[] args) {
        int [] arr = {-2,-1,3,4,5,6};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        for (int i=0;i< arr.length;i++){
            if (arr[i] < minimum){
                secondMinimum = minimum;
                minimum = arr[i];
            }
            else if (arr[i] != minimum && arr[i] < secondMinimum){
                secondMinimum = arr[i];
            }
        }

            return secondMinimum;
    }
}
