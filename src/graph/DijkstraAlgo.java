package graph;

import java.util.*;

public class DijkstraAlgo {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> dijkstra(ArrayList<ArrayList<Pair>> adj, int src) {
        int n = adj.size();
        long[] dist = new long[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        Arrays.fill(dist,Integer.MAX_VALUE);
        pq.offer(new Pair(0,src));
        dist[src] = 0;
        while (!pq.isEmpty()){
            Pair pair = pq.poll();
            int wt = pair.wt;
            int node = pair.node;
            for (Pair p : adj.get(node)){
                int xWt = p.wt;
                int it = p.node;
                if (wt+xWt < dist[it]){
                    dist[it] = wt+xWt;
                    int nWt =wt+xWt;
                    pq.offer(new Pair(nWt,it));
                }
            }
        }
        ArrayList<Integer> path = new ArrayList<>();
        for (long it : dist){
            path.add((int)it);
        }
        return path;
    }
    static class Pair{
         int wt;
         int node;
        public Pair(int wt, int node){
            this.wt = wt;
            this.node = node;
        }
    }
}