package Functions;

public class shadowing {
    static int x=90;// this variable is shadowed by the class variable at line 8

    static void main(String[] args) {
        System.out.println(x);
        int x=40;//this class variable shadows the outer variable
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }

}
