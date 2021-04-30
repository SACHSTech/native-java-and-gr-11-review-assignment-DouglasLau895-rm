package gr11review.part1;

import java.io.*;

public class Review7 {
    public static void main(String[] args) throws IOException{

      // declaring a keyboard "object"
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
      
      // declare variables
      String theSentence;
      int charNum;
      int spaceNum;
      int letterNum;
      int letterANum = 0;
      String oddChar = "";

      // ask user to enter theSentence
      System.out.println("Enter the Sentence: ");
      theSentence = keyboard.readLine();

      // determine the number of characters in the theSentence
      charNum = theSentence.length();
      System.out.println("There are " + charNum + " characters in the sentence.");

      // determine the number of spaces in theSentence
      spaceNum = theSentence.length() - theSentence.replaceAll(" ", "").length();
      System.out.println("There are " + spaceNum + " spaces in the sentence.");

      // determine the number of letter "A" in theSentence
      theSentence = theSentence.toLowerCase();
      for (int i = 0; i < theSentence.length(); i++) {
         if (theSentence.charAt(i) == 'a') {
         letterANum++;
         }
      }
      System.out.println("There are " + letterANum + " letter a in the sentence.");

      // take odd number characters of theSentence
      for (int count = 0; count <= theSentence.length(); count++) {
          if (count % 2 != 0) {
            oddChar += "-";
          }
      }
      System.out.println(oddChar);
    }
}