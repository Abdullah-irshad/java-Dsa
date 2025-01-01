package graph;

import java.util.*;

public class FloodFill {
    public static void main(String[] args) {
        int image[][] = {
                {1,1,1},
        {1,1,0},
        {1,0,1}
        };
        int[][] ans = floodFill(image,1,1,2);
        for (int[] ar : ans){
            System.out.println(Arrays.toString(ar));
        }
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(List.of(1,2,3)));
        lists.add(new ArrayList(List.of(4,5,6)));
        for (int list : lists.get(0)){
            System.out.println(list);
        }
    }
    static class Tuple{
        int row;
        int col;
        public Tuple(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
   static public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int initCol = image[sr][sc];
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = image[i][j];
            }
        }
        Queue<Tuple> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];
        q.add(new Tuple(sr,sc));
        vis[sr][sc] = true;
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            int r = tuple.row;
            int c = tuple.col;
            ans[r][c] = color;
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow >=0 && nrow <n && ncol >=0 && ncol<m && image[nrow][ncol] == initCol && !vis[nrow][ncol]){
                    ans[nrow][ncol] = color;
                    vis[nrow][ncol] = true;
                    q.offer(new Tuple(nrow,ncol));
                }
            }
        }
        return ans;
    }
}
