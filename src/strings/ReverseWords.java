package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String str2 = "  hello world  ";
        String str3 = "a good   example";
        System.out.println(reverseWords(str3));
    }
    static String reverseWords(String str){
        int i = str.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            while (i>=0 && str.charAt(i) == ' ')i--;
            int j = i;
            while(i>=0 && str.charAt(i) !=' ')i--;
            if(sb.isEmpty()){
                sb.append(str,i+1,j+1);
            }else{
                sb.append(" ");
                sb.append(str,i+1,j+1);
            }
        }
        return sb.toString();
    }
}
