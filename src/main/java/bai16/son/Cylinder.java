package bai16.son;

import bai16.dad.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height=height;
        System.out.println("Contructed a Cylinder with cylinder(height)");
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
        System.out.println("Constructed a Cylinder with Cylinder (height,radius)");
    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
        System.out.println("Constructed a Cylinder with Cylinder (height,radius,color)");
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolum(){
        return getArea()*height;
    }
    public String toString(){
        return "this is a Cylinder";
    }
}
