package bai3;

public class ex5_2 {
    public static void main(String[] args) {
        int absvalue=-5;
        if(absvalue<0) absvalue=-absvalue;

        int min=0,value=-5;
        if (value<min){
            min=value;
            System.out.println("Found new min");
        }
        int mark=50;
        if(mark>=50)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Try Harder");
        }
        int number1=8,number2=9,adsDiff;
        if(number1>number2) adsDiff=number1-number2;
        else adsDiff=number2-number1;

    }
}
