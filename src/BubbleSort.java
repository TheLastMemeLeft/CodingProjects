import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void main(String[] var0) {
        if (var0.length < 3) {
            System.out.println("Enter 3 numbers!!");
            System.exit(0);
        }
        List myList = new ArrayList();
        int c1=0;
        int c2=1;
        int c3=c1;
        myList.add(var0[0]);
        myList.add(var0[1]);
        myList.add(var0[2]);
        int i=myList.size()-1;
            while(i>0){
                if( c1<c2){
                    while(true){
                        Collections.swap(myList, c1, c2);
                        c1++;
                        c2++;
                    }
//            i--;
                }
            }


    }
}

