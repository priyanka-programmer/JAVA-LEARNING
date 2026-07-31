package ArrayQus;
import java.util.Arrays;
public class AverageArray {
    static void main(String[] args) {
        int []arr={1,2,3,4,};

        System.out.println(avg(arr));
    }
    static double avg(int[]arr) {
        int num=arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double Avg = (double)sum / num;
        return Avg;
    }
}

