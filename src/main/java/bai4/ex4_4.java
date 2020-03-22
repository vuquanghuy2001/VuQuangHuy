package bai3;

public class ex4_4 {
    public static void main(String[] args) {
        int age=18;
        double weight=71.23;
        int height=191;
        boolean married=false;
        boolean attached=false;
        char gender='m';

        System.out.println(!married && !attached && (gender=='m'));
        System.out.println(married && (gender=='f'));
        System.out.println((height>=180) && (weight>=65) && (weight<=80));
        System.out.println((height>=80) || (weight>=90));
    }
}
