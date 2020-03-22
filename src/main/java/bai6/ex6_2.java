package bai3;

import java.util.Scanner;

public class ex6_2 {
    public static void main(String[] args) {
        int num1;
        double num2;
        String str;

        Scanner in=new Scanner(System.in);

        System.out.println("Enter an interger: ");
        num1=in.nextInt();
        num2=in.nextDouble();
        System.out.println("Enter a string: ");
        str=in.next();
        System.out.printf("%s,Sum of %d & %.2f %n", str, num1, num2, num1+num2);
        in.close();
    }
}
