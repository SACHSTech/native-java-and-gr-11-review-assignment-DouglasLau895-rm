package gr11review.part1;

import java.io.*;

public class Review2 {
    public static void main(String[] args) throws IOException{

      // declaring a keyboard "object"
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      // declare variables
      int menuOption;
      
      // display options
      System.out.println("0 - print a joke about your hair");
      System.out.println("1 - print a joke about your feet");
      System.out.println("2 - print a joke about your clothes");
      System.out.println("3 - print a joke about your teacher");

      // ask user for options
      System.out.println("Choose a menu option: ");
      menuOption = Integer.parseInt(keyboard.readLine());

      // display different jokes according to option choosen
      switch (menuOption) {
        case 0:
          System.out.println("Why do bees have sticky hair?");
          System.out.println("They always use honeycombs");
          break;
        default:
          System.out.println("Invalid menu option");
      }
    }
}