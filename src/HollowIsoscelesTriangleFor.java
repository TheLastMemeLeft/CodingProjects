import java.util.Scanner;
public class HollowIsoscelesTriangleFor {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number of lines you want");
    int totalLines = s.nextInt();
    int m=0;

    for (int line = 1; line <= totalLines; line++) {

        int spaces = totalLines - line;
        int spaceCount = 2 * line - 3;

        for (int i =0; i < spaces; i++) {
            System.out.print(" ");
        }

        if (line ==1){
            System.out.print("*");
        } else if (line == totalLines) {
            while(m<totalLines){
                System.out.print("* ");
                m++;
            }

        } else {
            System.out.print("*");
       for (int i =0; i < spaceCount; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        }
        System.out.println();

        }

    }
}
