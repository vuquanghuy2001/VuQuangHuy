package bai3;

import java.util.Scanner;

public class ex6_4 {
    public static void main(String[] args) {
        int number1,number2,sum;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        number1=in.nextInt();
        System.out.println("Enter second integer: ");
        number2=in.nextInt();
        sum=number1+number2;
        System.out.println("The sum is: "+sum);
        in.close();
    }
}
