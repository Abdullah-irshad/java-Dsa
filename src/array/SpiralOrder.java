package array;

import java.util.ArrayList;
import java.util.Arrays;

class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralOrder(matrix));
    }
    static ArrayList<Integer> spiralOrder(int[][] matrix){
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        int top =0;
        int bottom = n;
        int left = 0;
        int right = m;
        ArrayList<Integer> list = new ArrayList<>();

        // right
        while (left<= right && top <= bottom){

            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            // bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                // left
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<= right){
                // top
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
