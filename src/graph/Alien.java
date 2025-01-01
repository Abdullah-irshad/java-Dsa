package graph;

import java.util.*;

public class Alien {
    public static void main(String[] args) {
        String[] t1 = {"baa","abcd","abca","cab","cad"};
        String[] t2 = {"caa","aaa","aab"};
        String[] t3 = {"dhhid","dahi","cedg","fg","gdah","i","gbdei","hbgf","e","ddde"};
        System.out.println(findOrder(t1,4));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(11);
    }
    static String findOrder(String[] dict,int k){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] vis =new boolean[k];
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<k;i++){
            adj.add(new ArrayList<>());
        }

        for (int i=0;i<dict.length-1;i++){
            String str1 = dict[i];
            String str2 = dict[i+1];
            int min = Math.min(str2.length(),str1.length());
            for (int ptr = 0;ptr<min;ptr++){
                if (str1.charAt(ptr) != str2.charAt(ptr)){
                    adj.get(str1.charAt(ptr)-'a').add(str2.charAt(ptr)-'a');
                    break;
                }
            }
        }


        ArrayList<Integer> list = new ArrayList<>();
        bfs(adj,k,list);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<list.size();i++){
            int node = list.get(i) +'a';
            sb.append((char) node);
        }

        if (sb.length() != k)return "";
        return sb.toString();

//        for (int i=0;i<k;i++){
//            if (!vis[i]){
//                dfs(adj,vis,i,stack);
//            }
//        }


        ///dfs
//        StringBuilder sb = new StringBuilder();
//        while(!stack.isEmpty()){
//            int node = stack.pop() +'a';
//            sb.append((char) node);
//        }
//        if (sb.length() != k) return "";
//        return sb.toString();
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj,int k,ArrayList<Integer> list){
        int[] indegree = new int[k];
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<k;i++){
            for (int it:adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0;i<k;i++){
            if (indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node  = q.poll();
            list.add(node);
            for (int it : adj.get(node)){
                indegree[it]--;
                if (indegree[it] ==0){
                    q.offer(it);
                }
            }
        }
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node, Stack<Integer> stack){
     vis[node] = true;
     for (int it:adj.get(node)){
         if (!vis[it]){
             dfs(adj,vis,it,stack);
         }
     }
     stack.push(node);
    }
}
