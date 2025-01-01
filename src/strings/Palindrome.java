package strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }


    static String longestPalindrome(String s){
        int maxLen = 0;
        String sub = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            int l = i;
            int r =i;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                if (maxLen < r-l+1){
                    maxLen = r-l+1;
                    sub = s.substring(l,r+1);
                }
                r++;
                l--;
            }
            l = i;
            r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                if (maxLen < r-l+1){
                    maxLen = r-l+1;
                    sub = s.substring(l,r+1);
                }
                r++;
                l--;
            }
        }
        return sub;
    }
    public static String longestPalindromeBrute(String s) {
        int maxLen =0;
        String sub = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if(maxLen < (j-i+1)){
                        maxLen = j-i+1;
                        sub = s.substring(i,j+1);
                    }
                }
            }
        }
        return sub;
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j= s.length()-1;
        while(i<=j){
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
