package gr11review.part1;

import java.io.*;
import java.util.Random;

public class Review8 {
    public static void main(String[] args) throws IOException{

      Random rand = new Random();

      // declare variables
      int num1;
      int num2;
      int num3;
      int triplePulls = 0;

      // 1000 pulls
      for (int i = 0; i <= 1000; i++) {
      num1 = rand.nextInt(8);
      num2 = rand.nextInt(8);
      num3 = rand.nextInt(8);

      System.out.println(num1 + " " + num2 + " " + num3);

      // determine num of triple pulls
      if (num1 == num2 && num1 == num3 && num2 == num3) {
        triplePulls++;
      }
      }
      System.out.println(triplePulls);
    }
}