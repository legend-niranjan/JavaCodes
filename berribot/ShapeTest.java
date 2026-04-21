package berribot;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle=new Circle(5);
        System.out.println("Area: "+String.format("%.2f",circle.calculateArea()));
        System.out.println("Perimeter: "+String.format("%.2f",circle.calculatePerimeter()));

        Shape rectangle = new Rectangle(4,5);
        System.out.println("Area: "+String.format("%.2f",rectangle.calculateArea()));
        System.out.println("Perimeter: "+String.format("%.2f",rectangle.calculatePerimeter()));

    }
}

interface Shape{
    public double calculateArea();
    public double calculatePerimeter();
}

class Circle implements Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * (length+width);
    }
}
