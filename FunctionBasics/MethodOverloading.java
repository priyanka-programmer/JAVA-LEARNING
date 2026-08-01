package Functions;

public class MethodOverloading {
    static void main(String[] args) {
        fun(77);
        fun("PRIYANKA");
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }

}
