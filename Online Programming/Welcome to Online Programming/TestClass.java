// Problem: Write a program to print your name as output.

// Solution:

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Read the name from input
    String line = br.readLine();

    // Print the name
    System.out.println("Hello " + line);
  }
}
// Just click on SUBMIT to run the code
