package javaPrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		int number;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check prime: ");
		number = scan.nextInt();
		scan.close();
		
		for (int i=2; i<=number/2; i++)
		{
			if(number%i==0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(number + " is a prime number");
		}
		else
			System.out.println(number + " is not a prime number");
		}

}
