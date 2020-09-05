
import java.util.Scanner;

public class AIGuessNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String y = "";
        int numberoftimes = 1;

        int high = 100;
        int low = 0;
        System.out.println("Think of a number 1-100");

        int mid = (high+low)/2;
        System.out.println("is your number :"+ mid +" ( Y, H, L?)");
        y = s.next();

        while (!y.equalsIgnoreCase("Y")) {

            if (y.equalsIgnoreCase("h")) {
                low = mid;
            } else if (y.equalsIgnoreCase("l"))  {
                high = mid;
            }
            mid =  (high+low)/2;
            System.out.println("is your number :"+ mid +" ( Y, H, L?)");
            y = s.next();
            numberoftimes++;
            if (numberoftimes >= 8) {
                System.out.println("you cheated");
                System.exit(0);
            }
        }
        System.out.println("we guessed the number");
    }
}