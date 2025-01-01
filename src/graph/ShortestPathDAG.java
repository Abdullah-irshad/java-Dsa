package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ShortestPathDAG {
    public static void main(String[] args) {
        int[][] edges = {
                {0,1,2},{0,2,1}
        };
        int[][] e2 = {
                {0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}
        };
        int[] path = shortestPath(e2,6,7);
        System.out.println(Arrays.toString(path));
    }
    static int[] shortestPath(int[][]edges,int V,int E){
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i=0;i<V;i++){
            adj.add(new ArrayList<Pair>());
        }

        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new Pair(v,wt));
        }

        boolean[]  vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<V;i++){
            if (!vis[i]){
                dfs(i,adj,vis,stack);
            }
        }
        long[] dist = new long[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while (!stack.isEmpty()){
            int node = stack.pop();
            for (Pair pair : adj.get(node)){
                int v = pair.getV();
                int wt = pair.getWt();
                if(dist[node] +wt < dist[v]){
                    dist[v] = dist[node] +wt;
                }
            }
        }

        for (int i=0;i<V;i++){
            if (dist[i] == Integer.MAX_VALUE)dist[i] = -1;
        }
        int[] ans = new int[V];
        int i=0;
        for (long it : dist){
            ans[i++] =(int) it;
        }
        return ans;
    }

    static void dfs(int node,ArrayList<ArrayList<Pair>> adj,boolean[]vis,Stack<Integer> stack){
        vis[node]=  true;
        for (int i=0;i<adj.get(node).size();i++){
            int v = adj.get(node).get(i).getV();
            if (!vis[v]){
                dfs(v,adj,vis,stack);
            }
        }
        stack.push(node);
    }

}


class  Pair{
    int v;
    int wt;
    public Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }

    public int getV() {
        return v;
    }

    public int getWt() {
        return wt;
    }
}
