package bai3;
import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;
public class ex6_8 {
    public static void main(String[] args)
            throws FileNotFoundException {
        Formatter out=new Formatter(new File("resources/in.txt"));
        int num1=1234;
        double num2=55.66;
        String name="Paul";

        out.format("Hi %s,%n", name);
        out.format("The sum of %d and %2.f is %2.f%n",num1,num2,num1+num2);
        out.close();
        System.out.println("Done");
        }
    }

