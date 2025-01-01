package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Bipartite {
    public static void main(String[] args) {
    int[][] graph = {
            {1,2,3},{0,2},{0,1,3},{0,2}
    };
    int[][] graph2 = {
            {1,3},{0,2},{1,3},{0,2}
    };
        System.out.println(bipartite(graph));
    }
    static  boolean bipartite(int[][] graph){
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color,-1);
        for (int i =0;i<n;i++){
            if(color[i] == -1){
                if (!dfs(i, 0, graph, color))return false;
            }
        }
        return true;
    }
    static boolean dfs(int node, int col, int[][]graph,int[]color){
        color[node] = col;
        for (int it : graph[node]){
            if(color[it] == -1){
                if(!dfs(it, 1 - col, graph, color))return false;
            }else if(color[it] == color[node]){
                return false;
            }
        }
        return true;
    }
}
