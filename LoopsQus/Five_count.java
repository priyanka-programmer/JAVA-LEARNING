package Loops;

import java.util.Scanner;
public class Five_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num = sc.nextLong();
        int count = 0;
        while (num > 0) {
            long rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
