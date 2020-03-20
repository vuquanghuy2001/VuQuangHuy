package bai3;

import java.util.Scanner;

public class ex11_4 {
    public static void main(String[] args) {
        int number;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive interger: ");
        number=in.nextInt();

        if (isMagic(number)){
            System.out.println(number +" is a magic number");
        }else {
            System.out.println(number + "is a not magic number");
        }
        in.close();
    }

    public static boolean isMagic(int number){
        boolean isMagic=false;
        while (number>0){
            int digit=number%10;
            if (digit==8){
                isMagic=true;
                break;
            }
            number/=10;
        }
        return isMagic;
    }
}
