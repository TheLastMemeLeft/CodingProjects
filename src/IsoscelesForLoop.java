import java.util.Scanner;

public class IsoscelesForLoop {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);


        System.out.println("enter the number of lines you want");
        int totalLines = s.nextInt();

        for (int line = 1; line <= totalLines; line++) {

            int spaces = totalLines - line;
            int starCount = 2 * line - 1;

            for (int i =0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int i =0; i < starCount; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
