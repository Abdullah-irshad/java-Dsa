package hash.basic;

import java.util.HashMap;

public class CountString {
    public static void main(String[] args) {
        String str = "abacdb";
        count(str);
    }
    static void count(String str){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch  = str.charAt(i);
            if (hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }
            else {
                hashMap.put(ch,1);
            }
        }
        System.out.println(hashMap);
    }
}
