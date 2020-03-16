package bai1;
public class ex5 {
    public static void main(String[] args) {
        int number1=98;
        int number2=5;
        int sum,difference,product,quotient = 0,remainder;
        sum=number1+number2;
        difference=number1-number2;
        product=number1/number2;
        remainder=number1%number2;

        System.out.print("the sim,difference,product,quotient and remainder of ");
        System.out.print(number1);
        System.out.print(" and ");
        System.out.print(number2);
        System.out.print(" are ");
        System.out.print(sum);
        System.out.print(", ");
        System.out.print(product);
        System.out.print(", ");
        System.out.print(quotient);
        System.out.print(", and ");
        System.out.print(remainder );
    ++number1;
    --number2;
        System.out.println("number 1 after increment is " +number1);
        System.out.println("number 2 after decrement is " +number2);
        quotient=number1/number2;
        System.out.println("the new quotient of " + number1 + " and " + number2 + " is " +quotient);

        System.out.print("number1*31= ");
        System.out.println(number1*31);

        System.out.print("number2*17= ");
        System.out.println(number2*17);
    }
}
