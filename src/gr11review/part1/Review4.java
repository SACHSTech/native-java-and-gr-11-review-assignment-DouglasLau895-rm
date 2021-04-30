package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4 {
    public static void main(String[] args) throws IOException{

      // declaring a keyboard "object"
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      DecimalFormat d = new DecimalFormat("'$'0.00");


      // declare variables
      int itemNum;
      int count = 0;
      double price1 = 0;
      double price2 = 0;
      double price3 = 0;
      double price4 = 0;
      double subtotal;
      double tax;
      double total;

      // ask user for number of items
      System.out.println("How many items do you want to buy? ");
      itemNum = Integer.parseInt(keyboard.readLine());

      // enter price of each items
      for (int i = itemNum; i > 0; i--) {
        count++;
        System.out.println("Enter the price for item " + count + ": ");
        switch (i) {
          case 1:
           price1 = Double.parseDouble(keyboard.readLine());
           break;
          case 2:
           price2 = Double.parseDouble(keyboard.readLine());
           break;
          case 3:
           price3 = Double.parseDouble(keyboard.readLine());
           break;
          case 4:
           price4 = Double.parseDouble(keyboard.readLine());
           break;
        }
        
      }

      // calculate subtotal
      subtotal = price1 + price2 + price3 + price4;
      System.out.println("Subtotal: " + d.format(subtotal));

      // calculate tax
      tax = 0.13 * subtotal;
      System.out.println("Tax: " + d.format(tax));

      // calculate total
      total = tax + subtotal;
      System.out.println("Total: " + d.format(total));

    }
}