package graph;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class DistinctIslands {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 1, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1}};
        System.out.println(countDistinctIslands(grid));
    }

    static void bfs(int[][] grid,int row,int col,int n, int m, boolean[][] vis,ArrayList<String >shape){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,-1,0,+1};
        vis[row][col] = true;
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int r = pair.row;
            int c = pair.col;
            for (int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                shape.add(toString(r-row,c-col));
                if(
                        nrow >=0 && nrow < n
                                && ncol >=0 && ncol < m
                                && !vis[nrow][ncol]
                                && grid[nrow][ncol] == 1
                ){
                    vis[nrow][ncol] = true;
                    q.offer(new Pair(nrow,ncol));
                }
            }
        }
    }
    static class Pair{
        int row;
        int col;
        public Pair(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    static int countDistinctIslands(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        HashSet<ArrayList<String>> hashSet = new HashSet<>();
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    ArrayList<String> list = new ArrayList<>();
                    bfs(grid,i,j,n,m,vis,list);
//                    dfs(i,j,grid,list,vis,i,j,n,m);
                    hashSet.add(list);
                }
            }
        }
        return hashSet.size();
    }

    static void dfs(int row,int col,int[][] grid,ArrayList<String> list,boolean[][] vis,int row0,int col0,int n, int m){
        vis[row][col] = true;
        list.add(toString(row-row0,col-col0));
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};
        for (int i=0;i<4;i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(
                    nrow >=0 && nrow < n
                    && ncol >=0 && ncol < m
                    && !vis[nrow][ncol]
                    && grid[nrow][ncol] == 1
            ){
                dfs(nrow,ncol,grid,list,vis,row0,col0,n,m);
            }
        }
    }
    static String toString(int r,int c){
        return Integer.toString(r)+" "+Integer.toString(c);
    }
}
