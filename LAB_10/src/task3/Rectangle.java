package task3;

public class Rectangle extends Shape implements Printable{

    private final double width;
    private final double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public void print() {
        System.out.println("this is a rectangle");
    }
}
