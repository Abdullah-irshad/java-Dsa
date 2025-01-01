package strings;


import java.util.HashMap;
import java.util.Map;

public class SubStringCount {
    public static void main(String[] args) {
        System.out.println(substrCount("aba",2));
    }
    static long substrCount(String s, int k){
        if (k == 0) return 0;

        int count = 0;
        int left = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add character at the right to the window
            char rightChar = s.charAt(right);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
            if (freqMap.get(rightChar) == 1) distinctCount++;

            // Shrink window from the left if distinct count exceeds k
            while (distinctCount > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) distinctCount--;
                left++;
            }

            // Count valid substrings ending at right
            count += right - left + 1;
        }

        return count;
    }
}
