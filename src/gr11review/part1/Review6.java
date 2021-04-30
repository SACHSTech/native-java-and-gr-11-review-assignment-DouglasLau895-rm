package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review6 {
    public static void main(String[] args) throws IOException{

      // create objects
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      DecimalFormat moneyFormat = new DecimalFormat("'$'0.00");

      // declare variables
      double enterPrice;
      int count = 1;
      double subtotal = 0;
      double tax;
      double total;
      double[] price = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};

      // (input) allow user to enter price until they put "0"
      do {
      System.out.print("Enter the price for an item: ");
      enterPrice = Double.parseDouble(keyboard.readLine());
      price[count] = enterPrice;
      count++;
      }
      while (enterPrice != 0);

      // calculate and (output) display subtotal
      for (int i = 0; i < price.length; i++) {
      subtotal += price[i];
      }
      System.out.println("Subtotal: " + moneyFormat.format(subtotal));

      // calculate and (output) display tax
      tax = subtotal * 0.13;
      System.out.println("Tax: " + moneyFormat.format(tax));

      // calculate and (output) display total
      total = subtotal + tax;
      System.out.println("Total: " + moneyFormat.format(total));

    }
}