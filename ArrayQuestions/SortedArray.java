package ArrayQus;
import java.util.Arrays;
public class SortedArray {
    static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 9, 7};
        System.out.println(SortedArray(arr));
    }

    static boolean SortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

