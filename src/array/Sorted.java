package array;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
    static public boolean check(int[] arr) {
        int count = 0;
//        for (int i=1;i<arr.length;i++){
//            if (arr[i-1] > arr[i]){
//                System.out.println("in");
//                count++;
//            }
//        }
//        if (arr[arr.length-1] > arr[0]){
//            count++;
//        }
//        System.out.println(count);
//        return count <=1;

        /// second solution

        for (int i=0;i< arr.length;i++){
            if (arr[i] > arr[(i+1)% arr.length]){
                count++;
            }
            if (count >1){
                return false;
            }
        }
        return true;
    }
}
