package bai3;
import java.io.Console;
import java.util.Scanner;
public class ex6_11 {
    public static void main(String[] args) {
        Console con=System.console();
        if(con==null){
            System.err.println("Console Obiect is not available.");
            System.exit(1);
        }
        String name=con.readLine("Enter your name: ");
        con.printf("Hello %s%n",name);
        Scanner in=new Scanner(con.reader());
        con.printf("Enter an integer: ");
        int anInt=in.nextInt();
        con.printf("The integer is %d%n", anInt);
        con.printf("Enter a floating point number: ");
        double aDouble=in.nextDouble();
        con.printf("The floating point number entered is %f%n", aDouble);
        in.close();
    }
}
