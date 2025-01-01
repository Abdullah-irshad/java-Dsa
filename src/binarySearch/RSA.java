package binarySearch;

public class RSA {
    public static void main(String[] args) {
        int[] arr =  {4,5,6,7,0,1,2};
        int [] arr1 = {3,3,3,3,5,4,3,3,3,3,3};
        int[] arr3 = {1,0,1,1,1};
        int[] arr4 = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//        System.out.println(find(arr4,2));
        System.out.println(binarySearch(arr4,2,0,arr.length-1));
    }

    static int find(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        int pivot = pivot(arr);
        int start =0;
        if (pivot == -1){
            return binarySearch(arr,target,start,arr.length-1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (arr[start] <= target){
            return binarySearch(arr,target,start,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int pivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
//            else if (arr[start] > arr[mid]){
//                end = mid-1;
//            }
//            else if (arr[start] < arr[mid]){
//                start =  mid+1;
//            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                if (start < end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if (end>start && arr[end] > arr[end-1]){
                    return end;
                }
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start =  mid+1;
            }
            else {
                end =mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start, int end){
        boolean isAscending = arr[start] < arr[end];
        while(start <= end){
            int mid = start +(end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAscending){
                if (arr[mid] < target){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if (arr[mid] < target){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
