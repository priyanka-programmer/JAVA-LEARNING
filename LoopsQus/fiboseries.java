package Loops;

import java.util.Scanner;
public class fiboseries{
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        //USING FOR LOOP
//        for(int i=1;i<=n;i++){
//            System.out.print(a+ " ");
//            // update
//            int temp=a+b;
//            a=b;
//            b=temp;
        //USING WHILE LOOP
      int i=1;
      while(i<=n){
          System.out.print(a+ " ");
          int temp=a+b;
            a=b;
            b=temp;
            i++;
        }
    }
}