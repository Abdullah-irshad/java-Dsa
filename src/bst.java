public class bst {
    public static void main(String[] args) {
        Node root = null;
//        root = insert(50,root);
//        root = insert(30, root);
//        root = insert(20, root);
//        root = insert(40, root);
//        root = insert(70, root);
//        root = insert(60, root);
//        root = insert(80,root);
        root = iterativeInsert(50,root);
        iterativeInsert(30,root);
        iterativeInsert(20,root);
        iterativeInsert(40, root);
        iterativeInsert(70,root);
        iterativeInsert(60,root);
        iterativeInsert(80,root);
        root = delete(root,80);
        root = delete(root,111);
        inOrder(root);
        System.out.println(search(root,12));
    }

    static Node insert(int element,Node root){
        if (root == null){
            return  new Node(element);
        }
        if (root.element == element){
            return root;
        }
        if (root.element > element) {
            root.left = insert(element, root.left);
        }
        else {
            root.right = insert(element,root.right);
        }
        return root;
    }

    static Node iterativeInsert(int element,Node root){
        Node node = new Node(element);
        Node x = root;
        Node y = null;
        while(x != null){
            y = x;
            if (x.element > element){
                x = x.left;
            }
            else {
                x = x.right;
            }
        }

        if (y == null){
            y = node;
        }
        else if (y.element > element){
            y.left = node;
        }
        else {
            y.right = node;
        }
        return y;
    }

    static Node delete(Node root,int key){
        if (root == null){
            return root;
        }

        if (root.element > key){
            root.left = delete(root.left,key);
        }
        else if (root.element < key){
            root.right = delete(root.right,key);
        }
        else {
            if (root.right == null){
                return  root.left;
            }
            if (root.left == null){
                return root.right;
            }

            Node succ = getSuccessor(root);
            root.element = succ.element;
            root.right = delete(root.right,succ.element);
        }
        return root;
    }

    static Node getSuccessor(Node curr){
        curr = curr.right;
        while (curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    static int search(Node root, int target){
        if (root == null){
            return -1;
        }

        if (root.element == target){
            return root.element;
        }

        if (root.element < target){
            return search(root.right,target);
        }
        else {
            return search(root.left,target);
        }
    }

    static void inOrder(Node root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.element+" ");
            inOrder(root.right);
        }
    }
}

class Node{
    int element;
    Node left;
    Node right;
    Node(int element){
        this.element =element;
        this.right = null;
        this.left = null;
    }
}
