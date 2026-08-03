package Loops;

import java.util.Scanner;
public class Fibono{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        //USING FOR LOOP
        for (int count = 2; count <= n; count++) {
            // update
            int temp = a + b;
            a = b;
            b = temp;

        }
        System.out.print(b);
    }
}
