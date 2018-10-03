/*
You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000
 */


import java.util.Scanner;

class PrimeNumber {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println(primeNumbers);
    }

}