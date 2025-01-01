package graph;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RottenTomato {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},{1,1,0},{0,1,1}
        };
        System.out.println(orangesRotting(grid));
    }
    static int orangesRotting(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        Queue<Tuple> q= new LinkedList<>();
        int cntFresh =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.offer(new Tuple(i,j,0));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1)cntFresh++;
            }
        }
        int tm =0;
        int cnt =0;
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};
        while (!q.isEmpty()){
            Tuple tuple = q.poll();
            int r = tuple.row;
            int c = tuple.col;
            int t = tuple.tm;
            tm = Math.max(tm,t);
            for (int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >=0 && nrow<n && ncol >=0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.offer(new Tuple(nrow,ncol,t+1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if(cnt != cntFresh)return -1;
        return tm;
    }
}

class Tuple{
    int row;
    int col;
    int tm;
    public Tuple(int row, int col, int tm){
        this.col= col;
        this.row= row;
        this.tm = tm;
    }
}