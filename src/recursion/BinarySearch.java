package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,11,12,15};
        System.out.println(search(arr,11,0,arr.length-1));
    }
    static int search(int [] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]> target){
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }
}
