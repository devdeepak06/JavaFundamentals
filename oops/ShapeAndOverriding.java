package oops;

// Create the classes here
class Shape {

    String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public void printMyType() {
        System.out.println(this.shapeType);
    }
}

class Square extends Shape {

    int length;

    public Square(String shapeType, int length) {
        super(shapeType);
        this.length = length;
    }

    public void printMyType() {
        System.out.println(this.shapeType);
    }

    public int calculateArea() {
        return this.length * this.length;
    }
}

class Rectangle extends Shape {

    int length;
    int breadth;

    public Rectangle(String shapeType, int length, int breadth) {
        super(shapeType);
        this.length = length;
        this.breadth = breadth;
    }

    public void printMyType() {
        System.out.println(this.shapeType);
    }

    public int calculateArea() {
        return this.length * this.breadth;
    }
}

public class ShapeAndOverriding {

    public static void main(String args[]) {

        Square square = new Square("square", 5);
        square.printMyType();
        System.out.println(square.calculateArea());

        Rectangle rectangle = new Rectangle("rectangle", 5, 4);
        rectangle.printMyType();
        System.out.println(rectangle.calculateArea());
    }
}
