package javaPrograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a,b,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to swap: ");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		// Method #1 - Using third variable
		
		System.out.println("Before Swapping: " + a + "," + b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping: " + a + "," + b);
		
		
		//Method #2 - Without using third variable
		
		System.out.println("Before Swapping - W/O using Third variable: " + a + "," + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping - W/O using Third variable: " + a + "," + b);
		

	}

}
