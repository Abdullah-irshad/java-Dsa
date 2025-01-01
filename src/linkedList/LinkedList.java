package linkedList;

public class LinkedList {
    private Node root;
    private Node head;
    private int cnt = 0;
    public void insert(int data){
        if (root == null){
            root = new Node(data);
            head = root;
        }else{
            Node newNode = new Node(data);
            root.next = newNode;
            root = newNode;
        }
        cnt++;
    }

    public void insert(int[] arr){
        for (int j : arr) {
            insert(j);
        }
    }


    public void removeEle(int element){
        if(head.data == element){
            deleteHead();
        }
        Node temp = head;
        Node prev = head;
        while(temp != null){
            if (temp.data == element){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void delete(int position){
        Node temp = head;
        Node prev = head;
        if (position == 1){
            deleteHead();
            return;
        }
        if (position == cnt){
            deleteTail();
            return;
        }

        int cnt =0;

        while (temp.next != null){
            cnt++;
            if (cnt == position){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void deleteHead(){
        head = head.next;
    }

    public void deleteTail(){
        Node temp = head;
        if(temp.next == null){
            head = null;
            return;
        }
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public int search(int target){
        Node temp = head;
        while(temp != null){
            if (temp.data == target){
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void  print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int getLength(){
        return cnt;
    }

}
