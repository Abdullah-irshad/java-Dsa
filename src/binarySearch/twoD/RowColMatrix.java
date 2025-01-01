package binarySearch.twoD;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr2,11)));
    }
    static int[] search(int[][] matrix, int target){
        int row =0;
        int col = matrix.length-1;

        while (row < matrix.length && col >=0){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
