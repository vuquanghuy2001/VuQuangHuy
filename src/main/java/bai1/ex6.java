package bai1;

public class ex6 {
    public static void main(String[] args) {
        int num1=1;
        int num2=100;
        int product=0;
        int number=num1;
        while (number<=num2){
            product=number*number;
            ++number;
        }
        System.out.println("the sum from " + num1 +" to "+ num2 +" is " + product);
    }
    }
