package ArrayQus;
import java.util.Arrays;
public class CopyArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        CopyArray(arr);
    }

    static void CopyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Original Array:"+Arrays.toString(arr));
        System.out.println("Copied Array:"+Arrays.toString(copy));
    }
}
