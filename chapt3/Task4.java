package chapt3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string: ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);

        String rev = sb.reverse().toString();


     if (input.equals(rev)){
        System.out.println("The input string is a palindrome.");
     }

     else {System.out.println("The string is not a palindrome.");}

     }

        
        

    }

