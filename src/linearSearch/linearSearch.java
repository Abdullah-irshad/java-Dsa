package linearSearch;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,8,3,9,5};
        System.out.println(search(arr,11));
        String str = "hello";
        System.out.println(searchInString(str,'h'));


        int[][] arr2 = {
                {1,3,6,8},
                {5,9},
                {11,55,19}
        };
        int[] index = searchIn2DArray(arr2,55);
        System.out.println(Arrays.toString(index));
        System.out.println(max(arr2));
    }
    static int search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static boolean searchInString(String str, char target){
        if (str.length() == 0){
            return  false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    static int[] searchIn2DArray(int[][] arr,int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        if (arr.length ==0){
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for (int[] row : arr){
            for (int ele : row){
                if (ele>max){
                    max = ele;
                }
            }
        }
        return max;
    }
}
