// Problem: Print out the minimum number of operations so that every element in
//          array a is greater than or equal to every element in array b

// Solution: 

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {

		// Create Scanner object to handle user input
		Scanner input = new Scanner(System.in);

		// Variable to keep track of min number of operations
		// Needed to satisfy game's constraints
		int minOperations = 0;

		// Input sizes of both arrays
		int aSize = input.nextInt();
		int bSize = input.nextInt();

		int[] a = new int[aSize];
		int[] b = new int[bSize];

		// Fill elements in array a
		for (int i = 0; i < aSize; i++) {
			a[i] = input.nextInt();
		}

		// Fill elements in array b
		for (int i = 0; i < bSize; i++) {
			b[i] = input.nextInt();
		}

		for (int j = 0; j < b.length; j++) {

			for (int i = 0; i < a.length; i++) {

				// While the element in a is smaller
				// than the element in b
				while (a[i] < b[j]) {

					// Decrement the number by 1 (one operation)
					a[i] += 1;
					minOperations++;

					// If element in a is still smaller,
					// increment the element in a (one operation)
					if (a[i] < b[j]) {
						b[j] -= 1;
						minOperations++;
					}

				}
			}
		}
		
		// Print out the minimum operations to 
		// make every element in a >= every element in b
		System.out.println(minOperations);
	}
}
