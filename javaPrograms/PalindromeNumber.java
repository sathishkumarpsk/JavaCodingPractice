package javaPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome: ");
		int number = scan.nextInt();
		scan.close();
		
		int actualNumber = number;
		
		int reversedNumber=0;
		
		while (number!=0)
		{
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number/10;
		}
		
		if(actualNumber==reversedNumber)
			System.out.println("Entered number is Palindrome Number");
		else
			System.out.println("Entered number is not a Palindrome Number");
		
	}

}
