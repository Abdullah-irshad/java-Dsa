package binarySearch;

public class splitArray {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }

    static int splitArray(int[] arr,int m){
        int start =0;
        int end =0;
        for (int num:arr){
            start = Math.max(start,num);
            end +=num;
        }

        while(start<end){
            int mid = start +(end-start)/2;
            int sum =0;
            int partition =1;
            for (int num:arr){
                if (sum+num > mid){
                    sum = num;
                    partition++;
                }
                else {
                    sum +=num;
                }
            }
            if (partition<=m){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
