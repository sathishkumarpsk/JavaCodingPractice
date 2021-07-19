package javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to reverse:");
		String reversableString = input.next();
		System.out.println("Reversable String is: "+reversableString);
		
	//Method 1- Reverse using Char Array
		
		System.out.print("Reversed string using Char Array: ");
		char[] charArray = reversableString.toCharArray();
		for(int i=charArray.length-1; i>=0; i--)
		{
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		
	//Method 2 - Reverse without Char Array
		
		System.out.print("Reversed string without Char Array: ");
		String[] characters = reversableString.split("");
		for(int i=characters.length-1; i>=0; i--)
		{
			System.out.print(characters[i]);
		}
		
		input.close();

	}

}
