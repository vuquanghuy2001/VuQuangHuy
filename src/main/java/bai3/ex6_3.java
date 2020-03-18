package bai3;

import java.util.Scanner;

public class ex6_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string (with space): ");
        String str=in.nextLine();
        System.out.printf("%s%n", str);
        in.close();
    }
}
