package binaryTree;

import com.sun.source.tree.Tree;

import java.util.*;

public class VerticalOrder {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(1,2);
        map.put(2,1);
        for (int n : map.values()){
            System.out.println(n);
        }
    }
    static public List<List<Integer>> verticalTraversal(Node root) {
        Queue<Tuple> queue = new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        queue.offer(new Tuple(root,0,0));

        while(!queue.isEmpty()){
        Tuple tuple = queue.poll();
        int level = tuple.level;
        int vertical = tuple.vertical;
        Node node = tuple.node;

//            map.putIfAbsent(vertical,new TreeMap<>());
//            map.get(vertical).putIfAbsent(level,new PriorityQueue<>());
//            map.get(vertical).get(level).offer(node.val);

            map.computeIfAbsent(vertical,k->new TreeMap<>())
                            .computeIfAbsent(level,k->new PriorityQueue<>())
                                    .offer(node.val);
        if (node.left != null){
            queue.offer(new Tuple(node.left,vertical-1,level+1));
        }
        if (node.right != null){
            queue.offer(new Tuple(node.right,vertical+1,level+1));
        }
    }
    List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer,PriorityQueue<Integer>> map1 : map.values()){
        list.add(new ArrayList<>());
        for (PriorityQueue<Integer> nodes: map1.values()){
            while(!nodes.isEmpty()){
                list.get(list.size()-1).add(nodes.poll());
            }
        }
    }
        return list;
}
}


class  Tuple{
    Node node;
    int level;
    int vertical;
    public  Tuple(Node node, int vertical,int level){
        this.node = node;
        this.level = level;
        this.vertical = vertical;
    }
}
