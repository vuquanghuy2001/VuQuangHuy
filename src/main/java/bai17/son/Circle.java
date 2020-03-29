package bai17.son;

import bai17.dad.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle (double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return getArea();
    }
    public double getPerimeter(){
        return getPerimeter();
    }
    public String toString(){
        return "Circle[Shape[color="+super.getColor()+",filled="+super.isFilled()+",radius="+radius+"]";
    }
}
