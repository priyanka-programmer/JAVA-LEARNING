package LinearSearch;

public class CountEven {
    static void main(String[] args) {
        int[] arr = {12, 345, 2};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (digit(arr[i]) % 2 == 0) {
                count++;
            }

        }
        return count;
    }
    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}