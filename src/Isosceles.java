import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Isosceles
{
    public static void main(String args[])
    {
        if (args.length<1){
            System.out.println("enter a number greater than 0");
            System.exit(0);
        }
        int i=1;
        int lines=Integer.parseInt(args[0]);
        String star="*";
        if (lines > i){
            while(lines>=i){
                int spaceCount=lines-i;
                int starCount=2*i-1;
                while(spaceCount>0){
                    System.out.print(" ");
                    spaceCount=spaceCount-1;
                }
                while(starCount>0){
                    System.out.print(star);
                    starCount=starCount-1;
                }
                System.out.println();
                i=i+1;
            }
        }
    }
}

