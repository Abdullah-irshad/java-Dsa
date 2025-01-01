package recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "";
        StringBuilder  sb = new StringBuilder();
        for (char c : str.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        System.out.println(palindrome(sb.toString().toLowerCase(),0));
    }
    static boolean palindrome(String str,int i){
        if (i>=str.length()/2){
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return palindrome(str,i+1);
    }
}
