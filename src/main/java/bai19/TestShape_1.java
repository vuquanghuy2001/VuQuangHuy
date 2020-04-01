package bai19;

import bai18.son.Triangle;
import bai19.Shape_1;
import javafx.scene.shape.Rectangle;

public class TestShape_1 {
    public static void main(String[] args) {
        Shape_1 s1=new Rectangle_1(25,5);
        System.out.println(s1);
        System.out.println("Area is "+s1.getArea());

        Shape_1 s2=new Triangle_1(4,5);
        System.out.println(s2);
        System.out.println("Area is "+s2.getArea());

    }
}
