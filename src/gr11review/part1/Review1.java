package gr11review.part1;

import java.io.*;

public class Review1 {
    public static void main(String[] args) throws IOException{
      
     // create objects
     BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));


     // declare variables
     int month;
     int day;
     int dayOfTheYear = 0;

     // (input) ask user for month and day
     System.out.print("Enter the month number: "); 
     month = Integer.parseInt(keyboard.readLine());
     System.out.print("Enter the day number: "); 
     day = Integer.parseInt(keyboard.readLine());

     // calculate the day of the year
     switch (month) {
              case 1:
                  dayOfTheYear = 0 + day;
                 break;
              case 2:
                  dayOfTheYear = 31 + day;
                  break;
             case 3:
                  dayOfTheYear = 31 + 28 + day;
                  break;
              case 4:
                  dayOfTheYear = 31 + 28 + 31 + day;
                  break;
              case 5:
                  dayOfTheYear = 31 + 28 + 31 + 30 + day;
                  break;
             case 6:
                  dayOfTheYear = 31 + 28 + 31 + 30 + 31 + day;
                  break;
             case 7:
                  dayOfTheYear = 31 + 28 + 31 + 30 + 31 + 30 + day;
                  break;
              case 8:
                 dayOfTheYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
                  break;
             case 9:
                  dayOfTheYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + day;
                  break;
              case 10:
                  dayOfTheYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + day;
                  break;
              case 11:
                  dayOfTheYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + day;
                 break;
             case 12:
                  dayOfTheYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + day;
                 break;
         }

     // (output) display the day of the year
     System.out.println(dayOfTheYear);
    }
}