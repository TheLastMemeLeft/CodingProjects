public class AdditionBy2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter a number greater than 0");
        }
        long total=0;
        int number = Integer.parseInt(args[0]);
        if(number%2==0){
            while(number>0) {
                total = total + number;
                number = number - 2;
            }
        }
        if(number%2!=0){
            while(number>0) {
                total = total + number;
                number = number - 1;
            }
        }
        System.out.println(total);
    }
}