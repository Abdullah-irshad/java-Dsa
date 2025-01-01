package recursion.array;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rat {
    public static void main(String[] args) {

        boolean[][] visit = new boolean[5][5];
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(List.of(1,1,1,0,1)));
        mat.add(new ArrayList<>(List.of(1,0,1,1,1)));
        mat.add(new ArrayList<>(List.of(0,0,1,1,1)));
        mat.add(new ArrayList<>(List.of(1,0,0,1,1)));
        mat.add(new ArrayList<>(List.of(1,0,0,0,1)));
//        solveMaze(mat,visit,0,0,"",mat.size(),ans);
//        int[] di = {1,0,0,-1};
//        int[] dj = {0,-1,1,0};
        int[] di = {0, 1, 0, -1}; // Right, Down, Left, Up
        int[] dj = {1, 0, -1, 0};
        if (mat.get(0).get(0) == 1)solveMaze2(mat,visit,0,0,"",mat.size(),ans,di,dj);
        System.out.println(ans);
    }

    static void solveMaze2(ArrayList<ArrayList<Integer>> mat, boolean[][] visit, int i, int j, String move, int n, ArrayList<String> ans,
                           int[] di, int[] dj){
        if (i == n-1 && j == n-1){
            ans.add(move);
            return;
        }
//        String dir = "DLRU";
        String dir = "RDLU";
        for (int index =0;index<4;index++){
            int nexti = i + di[index];
            int nextj = j + dj[index];
            if (nexti >=0 && nextj >= 0 && nexti < n && nextj < n && !visit[nexti][nextj] && mat.get(nexti).get(nextj) ==1){
                visit[nexti][nextj] = true;
                solveMaze2(mat,visit,nexti,nextj,move+dir.charAt(index),n,ans,di,dj);
                visit[nexti][nextj] = false;
            }
        }
    }
    public static void solveMaze(ArrayList<ArrayList<Integer>> mat, boolean[][] visit, int i, int j, String move, int n, ArrayList<String> ans){
        if (i ==n-1 && j == n-1){
            ans.add(move);
            return;
        }
        //// Down
        if (i+1<n && !visit[i+1][j] && mat.get(i+1).get(j) == 1){
            visit[i][j] = true;
            solveMaze(mat,visit,i+1,j,move+"D",n,ans);
            visit[i][j] = false;
        }

        //// Left
        if (j-1>=0 && !visit[i][j-1] && mat.get(i).get(j-1)==1){
            visit[i][j] = true;
            solveMaze(mat,visit,i,j-1,move+"L",n,ans);
            visit[i][j] = false;
        }

        /// Right

        if (j+1<n && !visit[i][j+1] && mat.get(i).get(j+1) == 1){
            visit[i][j] =true;
            solveMaze(mat,visit,i,j+1,move+"R",n,ans);
            visit[i][j] = false;
        }

        /// Upward
        if (i-1>=0 && !visit[i-1][j] && mat.get(i-1).get(j) ==1){
            visit[i][j] = true;
            solveMaze(mat,visit,i-1,j,move+"U",n,ans);
            visit[i][j] = false;
        }
    }

}
