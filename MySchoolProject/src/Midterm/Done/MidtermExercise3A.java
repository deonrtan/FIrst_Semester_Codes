package Midterm.Done;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MidtermExercise3A {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float annualRate;
    float quarterlyRate;
    double principal;
    double interest;
    double finalAmount;
    byte quarter;
    int year;

    annualRate = 0.05F; // set annual interest to 5%

    int y = 1;

    System.out.print("Enter the year: ");
    year = input.nextInt(); // item 1

    System.out.print("Enter the initial principal: ");
    principal = input.nextDouble(); // item 2

    System.out.printf("%s%.2f%n", "Principal = ", principal); // item 3
    System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
    System.out.printf(
      "%6s%8s%16s%30s%n",
      "Year",
      "Quarter",
      "Interest Earned",
      "Amount at end of quarter"
    );

    quarterlyRate = (float) (principal + annualRate) / 4; // item 4
    quarter = 1;
    interest = (double) (principal * annualRate) / 4; // item 5
    finalAmount = principal + interest;
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );

    principal = finalAmount;
    quarter = 2; // item 6
    interest = (double) (principal * annualRate) / 4; // item 7
    finalAmount = principal + interest;
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );

    principal = finalAmount;
    quarter = 3; // item 8
    interest = (double) (principal * annualRate) / 4; // item 9
    finalAmount = principal + interest; // item 10
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );

    principal = finalAmount; // item 11
    quarter = 4; // item 12
    interest = (double) (principal * annualRate) / 4; // item 13
    finalAmount = principal + interest; // item 14
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );
    System.exit(0);
  }
} // end of the main method
