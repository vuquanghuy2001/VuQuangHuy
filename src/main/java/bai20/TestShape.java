package bai20;

public class TestShape {

    public static void main(String[] args) {
        Shape s1 = new Circle("black", true, 3.3);
        System.out.println(s1);
        System.out.println("s1.getArea:" +s1.getArea());
        System.out.println("s1.getArea:" +s1.getPerimeter());
        System.out.println("s1.getArea:" +s1.getColor());
        System.out.println("s1.getArea:" + ((Circle) s1).getRadius());
        System.out.println("s1.getArea:" +s1.isFilled());
//
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println("c1.getArea:" +c1.getArea());
        System.out.println("c1.getArea:" +c1.getPerimeter());
        System.out.println("c1.getArea:" +c1.getColor());
        System.out.println("c1.getArea:" + c1.getRadius());
        System.out.println("c1.getArea:" +c1.isFilled());
//
//        Shape s2 = new Shape();
        Shape s3 = new Rectangle("red", true, 3.3, 4.4 );
        System.out.println(s3);
        System.out.println("s3.getArea:" +s3.getArea());
        System.out.println("s3.getArea:" +s3.getPerimeter());
        System.out.println("s3.getArea:" +s3.getColor());
//
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
//
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println("Square get:" + ((Square) s4).getSide());
//
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());
//
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getSide());
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getLength());
    }
}
