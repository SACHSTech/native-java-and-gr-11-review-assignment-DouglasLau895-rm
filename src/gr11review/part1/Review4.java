package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4 {
    public static void main(String[] args) throws IOException{

      // create objects
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 

      DecimalFormat moneyFormat = new DecimalFormat("'$'0.00");

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

      // (input) ask user for number of items
      System.out.print("How many items do you want to buy? ");
      itemNum = Integer.parseInt(keyboard.readLine());

      // (input) enter price of each items
      for (int i = itemNum; i > 0; i--) {
        count++;
        System.out.print("Enter the price for item " + count + ": ");
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

      // calculate and (output) display subtotal
      subtotal = price1 + price2 + price3 + price4;
      System.out.println("Subtotal: " + moneyFormat.format(subtotal));

      // calculate and (output) display tax
      tax = 0.13 * subtotal;
      System.out.println("Tax: " + moneyFormat.format(tax));

      // calculate and (output) display total
      total = tax + subtotal;
      System.out.println("Total: " + moneyFormat.format(total));

    }
}