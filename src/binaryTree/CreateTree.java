package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateTree {

    private CreateTree(){}
    private static  CreateTree createTree = null;
    public static CreateTree getInstance(){
        if (createTree == null){
            createTree = new CreateTree();
        }
        return createTree;
    }
    public Node createTree(ArrayList<Integer>list){
        if (list.isEmpty()){
            throw  new Error("list is empty");
        }
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(list.get(0));
        queue.offer(root);

        int i =1;
        while(i<list.size()){
            Node current = queue.poll();

            if (i<list.size()){
                assert current != null;
                current.left = new Node(list.get(i));
                queue.offer(current.left);
                i++;
            }
            if(i < list.size()){
                current.right = new Node(list.get(i));
                queue.offer(current.right);
                i++;
            }
        }
        return root;
    }
}
