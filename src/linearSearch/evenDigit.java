package linearSearch;

public class evenDigit {
    public static void main(String[] args) {
        int[] arr = {1,22,333,4046,111};
        System.out.println(evenDigit(arr));
        int num = 123;
        System.out.println(reverseNum(num));
    }

    static int reverseNum(int num){
        if (num == 0){
            return 0;
        }
        int reverse =0;
        while(num>0){
            reverse = (reverse*10) + num%10;
            num /= 10;
        }
        return reverse;
    }
    static int evenDigit(int[] arr){
        int count = 0;
        if (arr.length == 0){
            return 0;
        }
        for (int ele : arr){
            if (countDigit(ele)){
                count++;
            }
        }
        return count;
    }
    static boolean countDigit(int ele){
        int digits = (int) Math.log10(ele)+1;
//        while (ele>0) {
//            ele /= 10;
//            digits++;
//        }
        return digits%2 ==0;
    }
}
