package Loops;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        while(num>0){

            count=count+1;
            num=num/10;
        }
        System.out.println("Number of digits:"+count);
    }
}