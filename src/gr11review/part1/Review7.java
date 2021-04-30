package gr11review.part1;

import java.io.*;

public class Review7 {
    public static void main(String[] args) throws IOException{

      // create objects
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
      
      // declare variables
      String theSentence;
      int charNum;
      int spaceNum;
      int letterNum;
      int letterANum = 0;
      String oddChar = "";

      // (input) ask user to enter theSentence
      theSentence = keyboard.readLine();

      // determine and (output) display the number of characters in the theSentence
      charNum = theSentence.length();
      System.out.println("There are " + charNum + " characters in the sentence.");

      // determine and (output) display the number of spaces in theSentence
      spaceNum = theSentence.length() - theSentence.replaceAll(" ", "").length();
      System.out.println("There are " + spaceNum + " spaces in the sentence.");

      // determine and (output) display the number of letter "A" in theSentence
      theSentence = theSentence.toLowerCase();
      for (int i = 0; i < theSentence.length(); i++) {
         if (theSentence.charAt(i) == 'a') {
         letterANum++;
         }
      }
      System.out.println("There are " + letterANum + " letter a in the sentence.");

      // (output) take odd number characters of theSentence into "-" 
      for (int count = 0; count <= theSentence.length(); count++) {
          if (count % 2 != 0) {
            oddChar += "-";
          }
      }
      System.out.println(oddChar);
    }
}