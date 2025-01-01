package array;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        int [][]  ans = rotateBrute(matrix);
        for (int[] row : ans){
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] rotateBrute(int[][] matrix){
        int [][] ans= new int[matrix.length][matrix[0].length];
        for (int i=0;i< matrix.length;i++){
            for (int j =0;j<matrix[0].length;j++){
                ans[j][(matrix.length-1)-i] = matrix[i][j];
            }
        }

        return ans;
    }
}
