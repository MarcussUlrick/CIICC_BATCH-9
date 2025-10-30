import java.util.Scanner;
public class LoopsLesson{
public static void main(String[] args) {
    byte a = 1;
    while(a<=10)
        System.out.println("a = "+a++);
    System.out.println("end of program");

    do 
    System.out.println("do while: a = "+a--);

    while(a<10);
        System.out.println("end of program");

    for(int b = 0; b<10; b++)
    System.out.println("b = "+b);

    //nested for loop
    
    System.out.println("enter a valid number");
    Scanner q = new Scanner(System.in);
    int limit = q.nextInt();
    for(int x=1; x<limit;) {
            for(int y=1; y<=x; y++) {
                System.out.println(x);
            }
            System.out.println();
             x++;
}
}
}