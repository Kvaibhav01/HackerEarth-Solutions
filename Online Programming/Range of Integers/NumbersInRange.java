// Problem: Write a program to list all the integers between two integers L and R (including L and R). L and R can be any integer between 1 and 100.
// 1<=L, R<=100

// Solution:

import java.util.Scanner;

public class NumbersInRange {

    public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      // Get L and R from the input
      int L = s.nextInt();
      int R = s.nextInt();

      // Write here the logic to print all integers between L and R
      for(int i=L;i<=R;i++)
        System.out.print(i+" ");
        System.out.println();

        s.close();
    }
}
