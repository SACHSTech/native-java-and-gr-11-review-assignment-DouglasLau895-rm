package gr11review.part1;

import java.io.*;

public class Review5 {
    public static void main(String[] args) throws IOException{

      // declaring a keyboard "object"
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      // declare variables
      double yearlyInvestAmount;
      double yearlyAddedMoney = 0;
      double compoundInterestRate;
      double targetAmount;
      int targetAmountTime = 0;
      double currentAmount;
      double currentInterest;

      // ask user for yearlyInvestAmount, compoundInterestRate, and targetAmount
      System.out.println("Enter the yearly invested amount: ");
      yearlyInvestAmount = Double.parseDouble(keyboard.readLine());
      System.out.println("Enter the compound interest rate: ");
      compoundInterestRate = Double.parseDouble(keyboard.readLine());
      System.out.println("Enter the target amount: ");
      targetAmount = Double.parseDouble(keyboard.readLine());

      // calculate targetAmountTime
      currentAmount = yearlyInvestAmount;
      compoundInterestRate = compoundInterestRate / 100;
      yearlyAddedMoney = yearlyInvestAmount;
      while (currentAmount < targetAmount && currentAmount > 0) {
        currentInterest = yearlyInvestAmount * compoundInterestRate;
        currentAmount = yearlyInvestAmount + currentInterest;
        yearlyInvestAmount = currentAmount + yearlyAddedMoney;
        targetAmountTime++;
      }

      // display targetAmountTime
      System.out.println("The target amount will be earned in " + targetAmountTime + " years. ");

    }
}