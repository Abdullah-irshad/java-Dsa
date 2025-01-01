package strings;

import java.util.HashMap;

public class BeautySum {
    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));
    }
    public static int beautySum(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> hashMap = new HashMap<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
                int m_f = 0;
                int l_f = Integer.MAX_VALUE;
                for (int freq : hashMap.values()) {
                    if (freq > 0) {
                        m_f = Math.max(m_f, freq);
                        l_f = Math.min(l_f, freq);
                    }
                }
                sum += (m_f - l_f);
            }
        }
        return sum;
    }
}
