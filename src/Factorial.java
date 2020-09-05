public class Factorial {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter a number greater than 0");
        }
        int i = 1;
        long total=1;
        int number = Integer.parseInt(args[0]);
        while(number>=i){
            total=total*number;
            number=number-1;
        }
        System.out.println(total);
    }
}
