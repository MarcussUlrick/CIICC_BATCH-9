package chapt4;

import java.util.Scanner;

public class Task7 {

    public static int add (int a, int b) {
        return a + b;
    }

    public static int subtract (int a, int b) {
        return a - b;
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static double divide (int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        
        Scanner click = new Scanner(System.in);

        System.out.println("Input first num: ");
        int num1 = click.nextInt();

        System.out.println("Input second num: ");
        int num2 = click.nextInt();

        int sum = add(num1, num2);
        int diff = subtract(num1, num2);
        int prod = multiply(num1, num2);
        double quot = divide(num1, num2);

        // Results

        System.out.println("Addition: "+sum);
        System.out.println("Subtraction: "+diff);
        System.out.println("Multiplication: "+prod);
        System.out.println("Division: "+quot);
    }
    
}
