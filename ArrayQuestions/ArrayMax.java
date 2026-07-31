package ArrayQus;
import java.util.Scanner;
public class ArrayMax {
    static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Max(arr));
    }

    static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
