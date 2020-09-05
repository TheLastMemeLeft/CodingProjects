import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        String YesNo = "Yes";
        String Sentence = "";
        do {
            System.out.println("Give me your word");
            String x = s.nextLine();
            Sentence= Sentence + " "+x;
            System.out.println("do you want to continue? (Yes or No)");
            YesNo = s.next();
            String h = "";
        } while (YesNo.equalsIgnoreCase("Yes"));

        System.out.println(Sentence);
    }
}