package javaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int poweredNumber = 0, remainder;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong: ");
		int number = scan.nextInt();
		scan.close();
		
		
		int enteredNumber = number;
		int numberOfDigits = String.valueOf(number).length();
		
		while(number!=0)
		{
			remainder = number % 10;
			poweredNumber += Math.pow(remainder, numberOfDigits);
			number = number / 10;
		}
		
		if(enteredNumber==poweredNumber)
			System.out.println("Entered number is an Armstrong Number");
		else
			System.out.println("Entered number is not an Armstrong Number");

	}

}
