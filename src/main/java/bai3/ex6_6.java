package bai3;

import java.util.Scanner;

public class ex6_6 {
    public static void main(String[] args) {
		int secretNumber;
		int nuberIn;
		int trialNumber = 0;
		boolean done = false;
		Scanner in = new Scanner(System.in);

		secretNumber = (int)( Math.random()*100);
		 while (! done)
		 {
			 ++trialNumber;
			 System.out.print("Enter your guess between 0 and 99: ");
			 nuberIn = in.nextInt();
			 if(nuberIn == secretNumber) {
			 System.out.println("Congratulation");
			 done = true;
			 }
			 else if (nuberIn < secretNumber) {
				 System.out.println("Try height");
			 }
			 else {
				 System.out.println("Try lower");
			 }
		 }
		 System.out.println("You got in "+ trialNumber +"trials");
		 in.close();
	}

}
