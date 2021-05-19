package gr11review.part1;

import java.io.*;

public class Review2 {
    public static void main(String[] args) throws IOException{

      // create objects
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      // declare variables
      int menuOption;
      
      // display options
      System.out.println("0 - print a joke about your hair");
      System.out.println("1 - print a joke about your feet");
      System.out.println("2 - print a joke about your clothes");
      System.out.println("3 - print a joke about your teacher");

      // (input) ask user for options
      System.out.print("Choose a menu option: ");
      menuOption = Integer.parseInt(keyboard.readLine());

      // (output) display different jokes according to option choosen
      switch (menuOption) {
        case 0:
          System.out.println("Why do bees have sticky hair?");
          System.out.println("They always use honeycombs");
          break;
        case 1:
         System.out.println("Person 1: Are you having a bad day?");
         System.out.println("Person 2: Yea, I started out on th wrong foot.");
        case 2: 
         System.out.println("What is DNA’s favourite piece of clothing?");
         System.out.println("Jeans (genes)");
        case 3: 
        System.out.println("Why did the teacher wear sunglasses?");
        System.out.println("Because the class was so bright!");
        default:
          System.out.println("Invalid menu option");
      }
    }
}