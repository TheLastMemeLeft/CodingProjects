import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(100) + 1;
        int times = 0;
        int Guess = 0;

        System.out.println("guess a number between 1-100!");
        while (Guess != x) {
            Guess = s.nextInt();
            if (Guess > x) {
                System.out.println("lower");
            }
            if (Guess < x) {
                System.out.println("higher");
            }
            if (Guess > 100 || Guess < 0) {
                System.out.println("ENTEr VALID NUMBERS");
                times--;
            }
            times++;
        }
        System.out.println("you guessed the number in " + times + " time");
    }
}