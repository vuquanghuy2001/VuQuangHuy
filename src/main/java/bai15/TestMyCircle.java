package bai15;
import java.util.*;
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        MyCircle c2 = new MyCircle(1,2, (int) 3.3);
        System.out.println(c2);


        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("center's x is : "+c1.getCenterX());
        System.out.println("center's y is : "+c1.getCenterY());
        c1.setCenter(31, 32);
        System.out.println(c1);
        System.out.println("center's x is : "+c1.getCenterXY()[0]);
        System.out.println("center's y is : "+c1.getCenterXY()[1]);

        System.out.println("area is : " +c1.getArea());
        System.out.println("circumference is : "+c1.getCircumference());

        System.out.println("distance is : "+c1.distance(c2));
        System.out.println("distance is : "+c2.distance(c1));

    }
}
