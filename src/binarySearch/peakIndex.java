package binarySearch;

// peak index in mountain array
public class peakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int [] arr1 = {2,5,6,7,11,10,9,5,3};
        int [] arr2 = {12,11,10,9,8,};
        int[]  arr3 = {1,2,3,4,5,6,7,8,9};
        int[] arr4 ={1,2,3,1};
        int[] arr5 = {1,2,1,3,5,6,4};


        System.out.println(peak(arr5));
        System.out.println(peakLinear(arr5));
    }
    static int peak(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
      while (start<end){
          int mid = start+(end-start)/2;
          if (arr[mid] < arr[mid+1]){
              start = mid+1;
          }
          else if (arr[mid] > arr[mid+1]){
              end = mid;
          }
      }
        return arr[end];
    }
    static int peakLinear(int[] arr){
        int end = arr.length-1;
        int i =0;
        for (;i<arr.length-1;i++){
            if ((i ==0 || arr[i-1] < arr[i]) && (i == end || arr[i] > arr[i+1])){
                return arr[i];
            }
        }
        return 0;
    }
}
