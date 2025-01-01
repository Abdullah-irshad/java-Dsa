package recursion.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        List<int[]> edge = new ArrayList<>();
        edge.add(new int[]{0,1});
        edge.add(new int[]{1,2});
        for (int it : edge.get(0)){
            System.out.println(it);
        }
//        List<List<String>> ans = new ArrayList<>();
//        solve2(4,ans);
//        for (List<String> list : ans){
//            System.out.println(list);
//        }
    }
    static List<List<String>> solve(int n,List<List<String>> ans){
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        dfs(board,0,n,ans);
        return ans;
    }

    static boolean  isValid(int row,int column, int n, char[][] board){
        ///// upper diagonal
        int i = row;
        int j = column;
        while(i>=0 && j>=0){
            if (board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }

        /// check columns
         i= row;
        j = column;
        while(j>=0){
            if (board[i][j] == 'Q'){
                return false;
            }
            j--;
        }

        //// check lower diagonal
        i = row;
        j=column;
        while (i<n && j>=0){
            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;
    }
    static void dfs(char[][] board,int column, int n,List<List<String>> ans){
        if (column == n){
            List<String> current = new ArrayList<>();
            for (int i=0;i<n;i++){
                current.add(new String(board[i]));
            }
            ans.add(current);
            return;
        }
        for (int row =0;row<n;row++){
            if (isValid(row,column,n,board)){
                board[row][column] = 'Q';
                dfs(board,column+1,n,ans);
                board[row][column] = '.';
            }
        }
    }
    static List<List<String>> solve2(int n, List<List<String>> ans){
        int[] row = new int[n];
        int[] upperDiagonal = new int[n*2-1];
        int[] lowerDiagonal = new int[n*2-1];
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        dfs2(row,upperDiagonal,lowerDiagonal,0,board,n,ans);
        return ans;
    }
    static void dfs2(int[] row,int[] upperDiagonal,int[] lowerDiagonal, int columnIndex,char[][] board,int n, List<List<String>> ans){
        if (columnIndex == n){
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }
        for (int rowIndex =0;rowIndex<n;rowIndex++){
            if (row[rowIndex] == 0 &&
                    upperDiagonal[n-1 +columnIndex -rowIndex] == 0 &&
                    lowerDiagonal[rowIndex+columnIndex] == 0
            ){
                row[rowIndex] = 1;
                upperDiagonal[n-1 +columnIndex -rowIndex] =1;
                lowerDiagonal[rowIndex+columnIndex]=1;
                board[columnIndex][rowIndex] = 'Q';
                dfs2(row,upperDiagonal,lowerDiagonal,columnIndex+1,board,n,ans);
                row[rowIndex] = 0;
                upperDiagonal[n-1 +columnIndex -rowIndex] =0;
                lowerDiagonal[rowIndex+columnIndex]=0;
                board[columnIndex][rowIndex] = '.';
            }
        }
    }
}
