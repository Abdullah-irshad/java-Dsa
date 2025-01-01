package array;

import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }


    static void setZeroes(int[][] matrix){
        int col =1;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] =0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col = 0;
                    }
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for (int j=1;j<matrix[i].length;j++){
                if (matrix[0][j] == 0 || matrix[i][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0){
            for (int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }

        if (col == 0){
            for (int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
    static void setZeroesBetter(int [][] matrix){
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    static void setZeroesBrute(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i<n;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j] == 0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markRow(int[][] matrix, int i) {
        for (int j=0;j<matrix[i].length;j++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] matrix, int j) {
        for (int i=0;i<matrix.length;i++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

}
