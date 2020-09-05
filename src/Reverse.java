
public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverse(1234));
    }

    public static int reverse(int input) {
        int i;
        int output=0;
        int counter=input;
        while(counter!=0){
            output=10*output+counter%10;
            counter=counter/10;


        }
        return output;
    }
}
