package javaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of times");
		int input = scan.nextInt();
		scan.close();

		System.out.println("Fibonacci Series of the number is:");
		for (int i = 0; i < input; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}

	}
}
