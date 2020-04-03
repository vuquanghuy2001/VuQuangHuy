package bai20;

public class Circle extends Shape {
    double radius;

    //    Constructor
    public Circle() {
        this.radius = 1.0f;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
//    Getter Setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*2.0*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", " + radius + "]";
    }

}
