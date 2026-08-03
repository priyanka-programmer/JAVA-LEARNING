package Loops;

import java.util.Scanner;
public class Sum_of_digit{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println("Sum of the digits is :"+sum);
        }
    }
