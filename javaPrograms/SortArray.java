package javaPrograms;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		int temp;
		
		//Get number of elements in Array
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements you want in the array: ");
		int count = input.nextInt();
		
		
		//Get each elements of the Array
		System.out.print("Enter array elements:");
		int arr[] = new int[count];
		for (int i=0; i<count; i++)
		{
			arr[i]=input.nextInt();
		}
		
		
		//Sort the Array
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println("Array Sorted in Ascending");
		for (int i=0;i<count;i++)
		{
			System.out.println(arr[i]+",");
		}
		
		System.out.println("Array Sorted in Descending");
		for (int i=count-1;i>=0;i--)
		{
			System.out.println(arr[i]+",");
		}
		input.close();
			
		}

}
