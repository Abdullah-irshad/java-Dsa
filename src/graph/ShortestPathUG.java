package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUG {
    public static void main(String[] args) {

    }
    static int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        long[] dis = new long[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Queue<Integer> queue = new LinkedList<>();
        dis[src] =0;
        queue.add(src);
        while (!queue.isEmpty()){
            int node = queue.poll();
            for (int it : adj.get(node)){
                if (dis[node]+1<dis[it]){
                    dis[it] = dis[node]+1;
                    queue.offer(it);
                }
            }
        }
        for (int i=0;i<n;i++){
            if (dis[i]== Integer.MAX_VALUE)dis[i] = -1;
        }
        int[] ans = new int[n];
        int i=0;
        for (long it: dis){
            ans[i++] = (int) it;
        }
        return ans;
    }
}
