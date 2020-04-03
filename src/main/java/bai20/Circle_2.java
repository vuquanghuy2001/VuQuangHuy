package bai20;

public class Circle_2 implements GeometriObject {
    double radius;

    public Circle_2(){
        this.radius=1.0;
    }
    public Circle_2(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle_2{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
