public class Factor {
    public static void main(String[] args) {
        if (args.length<1){
            System.out.println("enter a number greater than 0");
        }
        int i=1;
        int number=Integer.parseInt(args[0]);
        while(number>=i){
            if(number%i==0){
                System.out.println(number+" is factorable by "+i);

            }
            i=i+1;
        }
    }
}