package bai18.son;

import bai18.dad.Shape;

public class Triangle extends Shape {
    private int base,height;
    public Triangle(String color,int base,int height){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
