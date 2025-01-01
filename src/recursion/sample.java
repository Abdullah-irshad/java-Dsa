package recursion;

public class sample {
    public static void main(String[] args) {
//        print();
        printNumber(0);
    }

    static void printNumber(int n){
        printRec(n,1);
    }
    static void printRec(int n, int i){
        if (n == 0){
            return;
        }
        if (i == n){
            System.out.println(i+" ");
            return;
        }
        System.out.println(i+" ");
        printRec(n,i+1);
    }
    static void print(){
        System.out.println("hello world 0");
        print1();
    }
    static void print1(){
        System.out.println("hello world 1");
        print2();
    }
    static void print2(){
        System.out.println("hello world 2");
        print3();
    }

    static void print3() {
        System.out.println("hello world 3");
        print4();
    }
    static void print4(){
        System.out.println("hello world 4");
    }

}
