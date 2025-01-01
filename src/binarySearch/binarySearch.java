package binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,8,9,22,44,88};
//        System.out.println(iterativeBinary(arr,88));
        System.out.println(binarySearch(arr,8));
    }

    static int binarySearch(int[] arr, int target) {
     int start = 0;
     int end = arr.length -1;
     if (arr.length == 0){
         return -1;
     }
     return recBinarySearch(arr,target,start,end);
    }
    private static int recBinarySearch(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]){
            return recBinarySearch(arr,target,start,mid-1);
        }
        else if (target > arr[mid]){
            return recBinarySearch(arr,target,mid+1,end);
        }
        return -1;
    }

    static int iterativeBinary(int arr[],int target){
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
