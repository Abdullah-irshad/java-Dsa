package recursion.array;

import java.util.ArrayList;
import java.util.List;

public class MColor {
    public static void main(String[] args) {
        int v = 4;
        int m = 3;
        List<int[]> edges = new ArrayList<>();
        edges.add(new int[]{0,1});
        edges.add(new int[]{1,2});
        edges.add(new int[]{2,3});
        edges.add(new int[]{3,0});
        edges.add(new int[]{0,2});
//        int[] color = new int[v];

//        int v = 3;
//        int m = 2;
//        List<int[]> edges = new ArrayList<>();
//        edges.add(new int[]{0,1});
//        edges.add(new int[]{1,2});
//        edges.add(new int[]{0,2});
////        edges.add(new int[]{3,0});
////        edges.add(new int[]{0,2});

        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        System.out.println(adj);
        int[] color = new int[v];
        System.out.println(colorGraph(adj,0,v,m,color));
    }
    static boolean isValid(List<List<Integer>> edges, int node, int[] color, int col){
        for(int it : edges.get(node)){
            if(color[it] == col) return false;
        }
        return true;
    }
    static boolean colorGraph(List<List<Integer>> edges,int node,int n, int m,int[] color){
        if(node == n){
            return true;
        }
        for(int col=1;col<=m;col++){
            if(isValid(edges,node,color,col)){
                color[node] = col;
                if(colorGraph(edges, node + 1, n, m, color))return true;
                color[node] = 0;
            }
        }
        return false;
    }
}
