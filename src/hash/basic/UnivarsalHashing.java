package hash.basic;

public class UnivarsalHashing {
    public static void main(String[] args) {
        int n = 4;
        int n2=5;
        System.out.println(hash(n));
        System.out.println(hash(n2));
    }
    static int hash(int n){
        int random =(int) Math.floor(1*Math.random()*((257-1)));
        return ((n*random+random)%257)%10;
    }
}
