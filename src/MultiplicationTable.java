public class MultiplicationTable {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter a number greater than 0");
        }
        int gridSize = Integer.parseInt(args[0]);
        int row=1;
        while(row<=gridSize){
            int column=1;
            while(column<=gridSize){
                System.out.print(row*column+"\t");
                column++;
            }
            System.out.println();
            row++;

        }
    }
}
