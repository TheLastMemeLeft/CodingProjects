package Inheritance;

public class Polygon {
    protected int sides;
    protected static final String uom = "inch";
    protected int[] values;


    public Polygon(int sides, int[] values){
        if(sides<3){
            System.out.println("invalid");
            System.exit(0);
        }
        if ( values==null || values.length !=sides){
            System.out.println("this is not a valid polygon");
            System.exit(0);
        }
        this.sides=sides;
        this.values=values;
    }

    protected int perimeter(){
        int perimeter=0;
        for(int i=0;i<sides;i++){
            perimeter=perimeter+values[i];
        }
        return perimeter;
    }
    public static void main(String[] args){
        Triangle p =new Triangle(3,4,5);
        System.out.println(p.perimeter());
    }
}