package bai18.son;

import bai18.dad.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Circle c1=new Cylinder(1.1,2.2);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
    }
}
