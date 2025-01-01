package linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        LinkedList ll = new LinkedList();
        int[] arr = {1,2,3,4,5,15,18};
//        ll.insert(arr);
//        System.out.println(ll.search(53));
//        ll.deleteHead();
//        ll.deleteTail();
//        ll.delete(4);
//        ll.removeEle(15);
//        ll.print();


        DLL dll = new DLL();

//        dll.insert(11);
//        dll.insert(12);
//        dll.insert(14);


        dll.insert(arr);
//        dll.remove();
//        dll.removeTail();
//        dll.removeTail();

//        dll.removePosition(6);

        dll.deleteNode(15);
        dll.deleteNode(5);

        dll.print(false);

    }
}
