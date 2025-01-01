package graph;

import java.util.*;

public class ShortestPathWUG {
    public static void main(String[] args) {
        int[][] edges = {
                {1, 2, 2}, {2, 5, 5}, {2, 3, 4}, {1, 4, 1}, {4, 3, 3}, {3, 5, 1}
        };
        List<Integer> path = shortestPath(5,6,edges);
        System.out.println(path);
    }
    static public List<Integer> shortestPath(int n, int m, int[][] edges) {
        int[] dis = new int[n+1];
        int[] path = new int[n+1];
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new Pair(wt,v));
            adj.get(v).add(new Pair(wt,u));
        }
        Arrays.fill(dis,Integer.MAX_VALUE);
        Arrays.fill(path,-1);
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(u -> u.wt));
        pq.add(new Pair(0,1));
        dis[1]=0;
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int wt = pair.wt;
            int u = pair.v;
            for (Pair p : adj.get(u)){
                int xWt = p.wt;
                int v = p.v;
                if (wt+xWt < dis[v]){
                    dis[v] = wt+xWt;
                    path[v] = u;
                    pq.offer(new Pair(dis[v],v));
                }
            }
        }
        System.out.println(Arrays.toString(path));
        if (dis[n] == Integer.MAX_VALUE){
            return Collections.singletonList(-1);
        }
        List<Integer> pathList = new ArrayList<>();
        int current = n;
        while (current != -1){
            pathList.add(current);
            current = path[current];
        }
        Collections.reverse(pathList);
        pathList.add(0,dis[n]);
        return pathList;
    }
    static class Pair implements  Comparable<Pair>{
        int wt;
        int v;
        public Pair(int wt, int v){
            this.wt = wt;
            this.v = v;

        }
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.wt,other.wt);
        }
    }

}
