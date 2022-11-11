package Midterm.Done;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MidtermExercise3B {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float annualRate;
    float quarterlyRate;
    double principal;
    double interest;
    double finalAmount;
    byte quarter;
    int year;

    annualRate = 0.05F;

    int y = 1;

    for (int i = 0; i < y; i++) {
      System.out.print("Enter the year: ");
      year = input.nextInt();

      System.out.print("Enter the initial principal: ");
      principal = input.nextDouble();

      System.out.printf("%s%.2f%n", "Principal = ", principal);
      System.out.printf(
        "%s%.2f%c%n",
        "Interest Rate = ",
        annualRate * 100,
        '%'
      );
      System.out.printf(
        "%6s%8s%16s%30s%n",
        "Year",
        "Quarter",
        "Interest Earned",
        "Amount at end of quarter"
      );

      quarterlyRate = (float) (principal + annualRate) / 4;
      quarter = 1;
      interest = (double) (principal * annualRate) / 4;
      finalAmount = principal + interest;
      System.out.printf(
        "%6s%8d%16.2f%30.2f%n",
        year,
        quarter,
        interest,
        finalAmount
      );

      principal = finalAmount;
      quarter = 2;
      interest = (double) (principal * annualRate) / 4;
      finalAmount = principal + interest;
      System.out.printf(
        "%6s%8d%16.2f%30.2f%n",
        year,
        quarter,
        interest,
        finalAmount
      );

      principal = finalAmount;
      quarter = 3;
      interest = (double) (principal * annualRate) / 4;
      finalAmount = principal + interest;
      System.out.printf(
        "%6s%8d%16.2f%30.2f%n",
        year,
        quarter,
        interest,
        finalAmount
      );

      principal = finalAmount;
      quarter = 4;
      interest = (double) (principal * annualRate) / 4;
      finalAmount = principal + interest;
      System.out.printf(
        "%6s%8d%16.2f%30.2f%n",
        year,
        quarter,
        interest,
        finalAmount
      );

      System.out.println();
      System.out.println("\nDo you want to compute again<Y/N>?");
      char answer = input.next().charAt(0);

      if (answer == 'Y' || answer == 'y') {
        y++;
      } else {
        System.out.println("\nThanks for using my program :)");
      }
    }
    System.exit(0);
  }
}
