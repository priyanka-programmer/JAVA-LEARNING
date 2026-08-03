package Loops;

import java.util.Scanner;
public class Counting{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=sc.nextInt();
        System.out.println("Enter the target:");
        int target=sc.nextInt();

        int count=0;
        while(num>0){
            int rem= num%10; // extracting remender
            if(rem==target){
                count++;
            }
            num=num/10; // removing last digit
        }
 System.out.println("The entered digit appears "  + count +  " times");

    }
}