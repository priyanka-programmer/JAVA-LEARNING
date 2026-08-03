package Loops;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int original=num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
        if (original== num) {
            System.out.println("Entered number is palindrome:" + num);
        } else {
            System.out.println("Entered number is not palindrome:");
        }
    }
}

