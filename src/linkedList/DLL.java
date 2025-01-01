package linkedList;

public class DLL {
    private dllNode head = null;
    private dllNode root = null;
    int cnt =0;
    public void insert(int data){
        if (root == null){
            root = new dllNode(data);
            head = root;
        }else{
            dllNode node = new dllNode(data);
            root.next = node;
            node.prev = root;
            root = node;
        }
        cnt++;
    }

    public void insert(int[] arr){
        for (int e : arr){
            insert(e);
        }
    }

    public void print(boolean reverse){
        if (reverse){
            dllNode temp = root;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.prev;
            }
        }else{
            dllNode temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }


    public void remove(){
        if (head.next == null){
            head = null;
            root = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void removeTail(){
        if (head.next == null){
            remove();
            return;
        }
//        dllNode temp = head;
//        while(temp.next.next != null){
//            temp = temp.next;
//        }
//        temp.next.prev = null;
//        temp.next = null;

        root = root.prev;
        root.next = null;

    }

    public void deleteNode(int data){
        if (head.data == data) {
            remove();
            return;
        }

        dllNode temp = head.next;
        dllNode prev = head.next;

        while(temp.next != null){
            if (temp.data == data){
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        if (temp.next ==  null && temp.data == data){
            prev.next = null;
            temp.prev = null;
        }

        if (temp.next != null && temp.data == data){
         prev.next = temp.next;
         temp.next.prev = prev;
         temp.next = null;
         temp.prev = null;
        }
    }

    public void removePosition(int position){
        if (position == 1){
            remove();
            return;
        }

        dllNode temp = head;
        dllNode prev = head;
        int count =0;

        while(temp.next != null){
            count++;
            if(count == position){
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp.next == null){
            prev.next = null;
            temp.prev = null;
            return;
        }

        prev.next = temp.next;
        temp.next.prev = prev;
        temp.next = null;
        temp.prev = null;
    }
}

 class dllNode{
    dllNode next;
    dllNode prev;
    int data;
    dllNode(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}