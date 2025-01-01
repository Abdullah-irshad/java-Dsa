package recursion;

public class RotateBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(bs(arr,9));
    }
    static int bs(int[] arr, int target){
        return bsRec(arr,target,0,arr.length-1);
    }

    private static int bsRec(int[] arr, int target, int s, int e) {
        if(s > e){
            return -1;
        }
        int mid = s +(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (arr[s] < arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return bsRec(arr,target,s,mid-1);
            }else{
                return bsRec(arr,target,mid+1,e);
            }
        }
        if(target >= arr[mid] && target <=arr[e]){
            return bsRec(arr,target,mid+1,e);
        }
        return bsRec(arr,target,s,mid-1);
    }
}
