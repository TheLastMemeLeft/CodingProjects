public class AdditionFractions {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter a number greater than 0");
        }
        float i = 1.0f;
        float total=1.0f;
        float number = Integer.parseInt(args[0]);
        while(number>=i){
            i=i+1.0f;
            total=total+1/i;

        }
     System.out.println(total);
    }
}