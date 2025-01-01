package strings;

import java.util.LinkedList;
import java.util.Queue;

public class RotationString {
    public static void main(String[] args) {
        rotationString("abcde","cdeab");
    }
    public static void rotationString(String s, String goal){
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2= new LinkedList<>();
        for (int i=0;i<s.length();i++){
            q2.add(s.charAt(i));
        }
        for (int i=0;i<goal.length();i++){
            q1.add(goal.charAt(i));
        }
        int i = q1.size()-1;
        int cnt =0;
        while(i !=0){
            char ch = q1.poll();
            q1.add(ch);
            System.out.println(q1);
            if (q1.equals(q2)){
                System.out.println("true "+cnt);
                break;
            }
            cnt++;
            i--;
        }
    }
}
