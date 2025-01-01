package recursion.array;

import strings.Str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"qprs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        String digit = "";
        StringBuilder sb = new StringBuilder();
        find("22",0,map,list,sb);
        System.out.println(list);
    }
    static void find(String str,int i, HashMap<Integer,String> map, List<String> ans, StringBuilder sb){
        if(i == str.length()){
            ans.add(sb.toString());
            return;
        }

        int x = str.charAt(i) - '0';
        String s = map.get(x);

        for (char ch : s.toCharArray()){
            sb.append(ch);
            find(str,i+1,map,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
