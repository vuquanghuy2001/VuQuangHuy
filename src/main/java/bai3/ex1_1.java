package bai3;

public class ex1_1 {
    public static void main(String[] args) {
        int lowerbound=1,upperbound=1000;
        int sumOdd=0;
        int sumEven=0;
        int absDiff;

        int number=lowerbound;
        while (number<upperbound){
            if (number%2==0){
                sumEven+=number;
            }else {
                sumOdd+=number;
            }
            ++number;
        }
        if (sumOdd>sumEven){
            absDiff=sumOdd-sumEven;
        }else {
            absDiff=sumEven-sumOdd;
        }
        System.out.println("The sum of odd numbers from"+lowerbound+" to "+upperbound +" is: "+sumOdd);
        System.out.println("The sum of even numbers from"+lowerbound+" to "+upperbound +" is: "+sumEven);
        System.out.println("the absolute difference between the tow sums is: "+absDiff);
    }
}
