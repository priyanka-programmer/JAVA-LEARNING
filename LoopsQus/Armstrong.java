package Loops;

import java.util.Scanner;
public class Armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digit number:");
        int num = sc.nextInt();
        int original=num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;// get last digit
            num = num / 10;//remove last digit
            sum = sum + (rem * rem * rem);


        }
        if (original== sum ) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
    }
}