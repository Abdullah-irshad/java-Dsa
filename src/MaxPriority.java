import java.util.*;

class Item {
    double key;
    int value;
    public Item(double key, int value){
        this.key = key;
        this.value = value;
    }
}
public class MaxPriority {
    public static void main(String[] args) {
//        PriorityQueue<Item> pq = new PriorityQueue<>(new Comparator<Item>(){
//            @Override
//            public int compare(Item i1, Item i2){
//                return Double.compare(i2.key,i1.key);
//            }
//        });
//
//        pq.add(new Item(1,1));
//        pq.add(new Item(1.2,3));
//        pq.add(new Item(3,10));
//        System.out.println(pq.poll().key);
//        System.out.println(pq.poll().key);

        PriorityQueue<Map.Entry<Double,Integer>> pq = new PriorityQueue<>((o1, o2) -> Double.compare(o2.getKey(),o1.getKey()));

        pq.add(new AbstractMap.SimpleEntry<>((double)12,1));
        System.out.println(pq.poll().getValue());
    }
}
