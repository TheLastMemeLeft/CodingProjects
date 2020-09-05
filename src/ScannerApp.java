import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total=0;
        String YesNo="Yes";
        String Equation="";
        do{
            System.out.println( "Gimme your number");
            int x=s.nextInt();
            total=total+x;
            Equation=Equation+x+" + ";
            System.out.println("do you want to continue? (Yes or No)");
            YesNo=s.next();
            String h = "";
        }while(YesNo.equalsIgnoreCase("Yes"));

        Equation = Equation.substring(0, Equation.length()-2);
        Equation  = Equation + " = " + total;
        System.out.println(Equation);
    }
}