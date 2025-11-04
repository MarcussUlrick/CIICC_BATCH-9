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
    String[] colors = {"black", "red", "yellow", "white", "blue"};
    for(String color: colors)
    System.out.println("Color: "+color);
    ROW_TABLE:   for(int p = 1; p<=10; p++){
    COL_TABLE:   for(int l = 1; l<=10; l++){

                    if(l==5)
                        //break COL_TABLE;
                        continue COL_TABLE;
                    System.out.print(p*l+ " \t");}
                    System.out.println();
    

    }
}

}