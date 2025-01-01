package binarySearch;

// find target in mountain array
public class mountainArray {
    public static void main(String[] args) {
        int [] arr = {2,4,5,7,4,2,1};
        int [] arr2 = {1,2,3,4,5,6};
        int [] arr3 = {8,7,6,5,4,3,2,1};
        System.out.println(find(arr3,1));
    }

    static int find(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        int mid = peak(arr);
        int start = 0;
        int ans =-1;
        ans = search(arr,target,start,mid);
        if (ans != -1 &&arr[ans] == target){
            return ans;
        }
        return search(arr,target,mid,arr.length-1);
    }

    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start +(end- start)/2;

            if (arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else if (arr[mid] > arr[mid+1]){
                end =  mid;
            }
        }

        return end;
    }

    static int search(int[] arr, int target, int start, int end){
        boolean isAscending = arr[start] < arr[end];
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAscending){
                if (arr[mid] > target){
                    end = mid-1;
                }
                else if (arr[mid] < target){
                    start = mid+1;
                }
            }
            else {
                if (arr[mid] > target){
                    start = mid+1;
                }
                else if (arr[mid] < target){
                    end = mid-1;
                }
            }
        }
        return -1;
    }

}
