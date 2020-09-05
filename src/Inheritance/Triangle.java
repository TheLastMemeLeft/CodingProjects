package Inheritance;

public class Triangle extends Polygon {
    public Triangle(int sideA, int sideB, int sideC) {
        super(3, new int []{sideA, sideB, sideC});
    }
}
