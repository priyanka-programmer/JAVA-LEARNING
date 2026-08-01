package Functions;
import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        fun(1,2);
        fun(3,4,5);
        fun(6,7,8);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }

}
