package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review6 {
    public static void main(String[] args) throws IOException{

      // declaring a keyboard "object"
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      DecimalFormat d = new DecimalFormat("'$'0.00");

      // declare variables
      double enterPrice;
      int count = 1;
      double subtotal = 0;
      double tax;
      double total;
      double[] price = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};

      // allow user to enter price until they put "0"
      do {
      System.out.println("Enter price for item " + count + ": ");
      enterPrice = Double.parseDouble(keyboard.readLine());
      price[count] = enterPrice;
      count++;
      }
      while (enterPrice != 0);

      // calculate subtotal
      for (int i = 0; i < price.length; i++) {
      subtotal += price[i];
      }
      System.out.println("Subtotal: " + d.format(subtotal));

      // calculate tax
      tax = subtotal * 0.13;
      System.out.println("Tax : " + d.format(tax));

      // calculate total
      total = subtotal + tax;
      System.out.println("Total: " + d.format(total));

    }
}