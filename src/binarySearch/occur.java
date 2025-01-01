package binarySearch;

public class occur {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        System.out.println(count(arr,1));
    }
    static int count(int[] arr, int x) {
        int start =0;
        int end = arr.length-1;
        int first = lastAndFirst(arr,x,start,end,true);
        int last = lastAndFirst(arr,x,start,end,false);

        if (first == -1 && last ==-1){
            return 0;
        }
        return last - (first-1);
    }
    static  int lastAndFirst(int[] arr,int x,int start, int end,boolean first){
        int ans = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(x < arr[mid]){
                end = mid-1;
            }
            else if(x > arr[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(first){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
