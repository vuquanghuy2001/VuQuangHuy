package bai16.son;

import bai14.Point;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1=new LineSub(1,2,3,4);
        System.out.println(l1);
        LineSub l2=new LineSub(new Point(5,6),new Point(7,8));
        System.out.println(l2);

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        System.out.println(l1);
        System.out.println("begin's x is: "+l1.getBeginX());
        System.out.println("begin's y is: "+l1.getBeginY());
        System.out.println("end's x is: "+l1.getEndX());
        System.out.println("end's y is: "+l1.getEndY());

        l1.setBeginXY(31,32);
        l1.setEndXY(33,34);
        System.out.println(l1);
        System.out.println("begin's x is: "+l1.getBeginXY()[0]);
        System.out.println("begin's y is: "+l1.getBeginXY()[2]);
        System.out.println("end's x is: "+l1.getEndXY()[0]);
        System.out.println("end's y is: "+l1.getEndXY()[1]);

    }
}
