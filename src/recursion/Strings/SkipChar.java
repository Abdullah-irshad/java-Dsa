package recursion.Strings;

import java.sql.Statement;

public class SkipChar {
    public static void main(String[] args) {
//        System.out.println(skip("abcad",'a'));
        System.out.println(skipWord("thisappleisgood","app"));
    }
    static String  skip(String str,char s){
        StringBuilder sb = new StringBuilder();
        if(str.isEmpty()){
            return sb.toString();
        }
        char ch = str.charAt(0);
        if(ch == s) {
            return skip(str.substring(1), s);
        }
        sb.append(ch);
        sb.append(skip(str.substring(1),s));
        return sb.toString();
    }
    static String skipWord(String str,String word){
        StringBuilder sb = new StringBuilder();
        if (str.isEmpty()){
            return sb.toString();
        }
        if (str.startsWith(word)){
            return skipWord(str.substring(word.length()),word);
        }
        sb.append(str.charAt(0));
        sb.append(skipWord(str.substring(1),word));
        return sb.toString();
    }
}
