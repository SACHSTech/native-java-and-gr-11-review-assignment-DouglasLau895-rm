package gr11review.part1;

import java.io.*;

public class Review3 {
    public static void main(String[] args) throws IOException{

      // declaring a keyboard "object"
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      // declare variables
      int num = 100;

      // print odd numbers from 20 to 100
      for (int i = 20; i <= 100; i++) {
	      if (i % 2 != 0) {
		      System.out.println(i);
        }
      }
      
      // print out a blank line
      System.out.println(" ");

      // prints the numbers from 29 to 2 in decreasing order
      for (int count = 29; count >= 2; count--) {
        System.out.println(count);
      }

    }
}