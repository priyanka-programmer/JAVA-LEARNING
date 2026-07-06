import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operation (+ - * / %) or X to exit:");
            char op = sc.next().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Goodbye!");
                break;
            }

            if (op != '+' && op != '-' && op != '*' && op != '/' && op != '%') {
                System.out.println("Invalid operation");
                continue;
            }

            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            double ans = 0;
            boolean valid = true;

            switch (op) {
                case '+' -> ans = num1 + num2;
                case '-' -> ans = num1 - num2;
                case '*' -> ans = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Error: cannot divide by zero");
                        valid = false;
                    } else {
                        ans = num1 / num2;
                    }
                }
                case '%' -> {
                    if (num2 == 0) {
                        System.out.println("Error: cannot mod by zero");
                        valid = false;
                    } else {
                        ans = num1 % num2;
                    }
                }
            }

            if (valid) {
                System.out.println("Result: " + ans);
            }
        }

        sc.close();
    }
}





