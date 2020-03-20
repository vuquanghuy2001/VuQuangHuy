package bai3;

public class ex11_6 {
    public static void main(String[] args) {
        int number=8,result;
        System.out.println("Incaller,beofre calling the method,number is: "+number);
        result=increment(number);
        System.out.println("In caller,after calling the method,number is: "+number);
        System.out.println("The result is "+result);
    }
    public static int increment(int number){
        System.out.println("Inside method,befoer operation,number is "+number);
        ++number;
        System.out.println("Inside,dfter operation,number is "+number);
        return  number;
    }
}
