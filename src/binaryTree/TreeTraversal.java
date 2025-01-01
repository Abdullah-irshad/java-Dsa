package binaryTree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        Node root = CreateTree.getInstance().createTree(list);
        System.out.println(preorder(root));;
        System.out.println(inorder(root));
        System.out.println(postorder(root));
        System.out.println(postOrderSingle(root));
    }

    static List<Integer> postOrderSingle(Node root){
        if (root == null){
            throw new Error("root is empty");
        }
        Stack<Node> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
       Node curr = root;
       while (curr != null || !st.isEmpty()){
           if (curr != null) {
               st.push(curr);
               curr = curr.left;
           }else{
               Node temp = st.peek().right;
               if (temp == null){
                   temp = st.pop();
                   ans.add(temp.val);
                   while (!st.isEmpty() && temp == st.peek().right){
                       temp = st.pop();
                       ans.add(temp.val);
                   }
               }else{
                   curr = temp;
               }
           }
       }
       return ans;
    }

    static List<Integer> postorder(Node root){
        if (root == null){
            throw new Error("root is empty");
        }
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node>  st2 = new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()){
             root = st1.pop();
             st2.add(root);
            if (root.left != null)st1.push(root.left);
            if (root.right != null) st1.push(root.right);
        }
        while (!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        return ans;
    }
    static List<Integer> inorder(Node root){
        if (root == null){
            throw new Error("root is empty");
        }
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (true){
            if (node != null){
                stack.push(node);
                node = node.left;
            }else{
                if (stack.isEmpty())break;
                node = stack.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }
    static List<Integer> preorder(Node root){
        if (root == null){
            throw new Error("root is empty");
        }
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left != null)stack.push(node.left);
            ans.add(node.val);
        }
        return ans;
    }
}
