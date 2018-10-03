/*
You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N. You can read more about the factorial of a number here.

Input Format:
The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number N.

Constraints

1<= N <= 10
 */

import java.util.Scanner;


class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);


        int i, fact = 1, number;
        number = in.nextInt();

        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

