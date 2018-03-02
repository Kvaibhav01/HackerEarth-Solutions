// Problem: Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100.
// 1<=N<=100

// Solution:

import java.util.Scanner;

public class AddTwoArrays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Reading integer from input
		int N = s.nextInt();

		int[] numArrayA = new int[N];
		int[] numArrayB = new int[N];
		int[] sumArray = new int[N];

		// Read numArray1
		for(int i=0; i<N; i++) {
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		for(int i=0; i<N; i++) {
			numArrayB[i] = s.nextInt();
		}

		// Write your logic here:
		for (i = 0;i < N;i++) {
      sumArray[i] = numArrayA[i] + numArrayB[i];
    }

    // Print the sumArray
		for(int i=0; i<N; i++) {
			System.out.print(sumArray[i] + " ");
		}
  }
}
