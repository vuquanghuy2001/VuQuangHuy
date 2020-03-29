package bai17.son;

import bai17.dad.Shape;

import java.awt.*;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return getArea();
    }
    public double getPerimeter(){
        return getPerimeter();
    }
    public String toString(){
        return "Rectangle[Shape[color="+super.getColor()+"filled="+super.isFilled()+",width="+width+",length="+length+"]";
    }
}
