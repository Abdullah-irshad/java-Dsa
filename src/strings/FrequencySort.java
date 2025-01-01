package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));

    }
    static String frequencySort(String s){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
        pq.addAll(hashMap.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            char ch = entry.getKey();
            int cnt = entry.getValue();
            sb.append(String.valueOf(ch).repeat(Math.max(0,cnt)));
        }
        return sb.toString();
    }
}
