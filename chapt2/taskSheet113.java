import java.util.Scanner;
public class taskSheet113 {
    public static void main(String[] args) {
        
        int checkNum = 10;
        String message;

        for (int i = 1; i <= checkNum; i++) {
            
            message = (i%2==0)? i+" is even number": i+ " is odd number";

        System.out.println(message);
        }

       
    }
    
}

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Grade here: ");
        int grade = sc.nextInt();


        switch (grade / 10) {
            case 10:
            case 9:
            System.out.println('A');
                break;
            
            case 8:
            System.out.println('B');
                break;
            
            case 7: 
            System.out.println('C');
                break;
            
            case 6:
            System.out.println('D');
                break;

            default:
            System.out.println('F');
                break;
        }
        sc.close();
    }
}

class ArithmeticSample {
 public static void main(String[] args) {
  do {
 int y = 1;
 System.out.print(y++ + " ");
 } while(y <= 10);
 }}
