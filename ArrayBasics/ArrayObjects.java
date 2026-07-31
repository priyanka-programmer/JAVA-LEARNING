package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayObjects {
    static void main(String[] args) {
        String[] str = new String[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));


        str[0] = "PRIYANKA";
        System.out.println(Arrays.toString(str));
    }
}

