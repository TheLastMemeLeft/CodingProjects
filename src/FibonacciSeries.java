public class FibonacciSeries {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter a number greater than 0");
        }
        int i=1;
        int f=1;
        int s=1;
        int storage=1;
        int nthTerm = Integer.parseInt(args[0]);

        while(nthTerm>=i){
            System.out.println(f);
            storage=f+s;
            f=s;
            s=storage;
            i++;
        }
    }
}