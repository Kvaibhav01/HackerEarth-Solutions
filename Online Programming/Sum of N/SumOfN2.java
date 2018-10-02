//Problem: Write a program to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100.
//1<=N<=100

//Solution:

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		int N ;
		int[] numArray;
		int sum = 0;
		int i= 0;
		
		Scanner s = new Scanner(System.in);

		System.out.print("How many number the array have? ");
		N = s.nextInt();
		
		if (1>=N) {
			System.out.println("The array must have at leats one element.");
			System.exit(0);
		}
		
		if (N>=100) {
			System.out.println("The array is too large.");
			System.exit(0);
		}
		

		// Define an array of integers of size N.
		numArray = new int[N];

		// Get the input
		while (i < N) {
			System.out.print("Input a number: ");
			numArray[i] = s.nextInt(); 
			i++;
		}

		i = 0; 
		
		// Write the logic to add these numbers here:
		while (i < numArray.length) {
			sum += numArray[i];
			i++;
		}
			
		
		// Print the sum
		System.out.print(sum);
		s.close();
	}
}
