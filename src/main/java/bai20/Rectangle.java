package bai20;

public class Rectangle extends Shape {
    double width;
    double length;

    //
    public Rectangle() {
        super();
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //    Getter Setter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2.0*(width*length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", " + width + ", " + length + "]";
    }
}
