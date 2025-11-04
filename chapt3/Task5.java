
package chapt3;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Input 3 numbers");

        System.out.println("Input first number:");
        int num1 = sc.nextInt();

        System.out.println("Input second number:");
        int num2 = sc.nextInt();

        System.out.println("Input last number:");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All the numbers are equal: "+num1 +num2+ num3);
        }
        else {
            int highest = num1;

        if (num2>highest) {
            highest = num2;
        }
        if (num3>highest) {
            highest = num3;
        }
        System.out.println("The highest number is: "+highest);
        }
        sc.close();
    }
}
