package strings;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1,s2));
    }
    static public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch,hash.get(ch)+1);
            }else{
                hash.put(ch,1);
            }
        }


        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(hash.containsKey(ch) && hash.get(ch) != 0){
                hash.put(ch,hash.get(ch)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
