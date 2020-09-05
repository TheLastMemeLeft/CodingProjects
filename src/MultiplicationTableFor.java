import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (args.length < 1) {
            System.out.println("enter a number greater than 0");
        }
        int gridSize = s.nextInt();
        int row=1;
        for(int r = row;row<=gridSize;row++){
            int column=1;
            for(int c=column;column<=gridSize;column++){
                System.out.print(row*column+"\t");
            }
            System.out.println();

        }
    }
}
