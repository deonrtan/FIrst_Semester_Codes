package Midterm.Done;

/*The Problem
        Write a program for the computation of the tax due corresponding to a given taxable income.
        The tax due is determined based on the following table:
        Taxable Income Tax Due
        <= 25,000.00 4,000.00
        > 25,000.00 but <= 125,000.00 4,000.00 + 8% (taxable income - 25,000.00)
        > 125,000.00 but <= 525,000.00 12,000.00 + 10% (taxable income - 125,000.00)
        > 525,000.00 52,000.00 + 12% (taxable income)
*/

/*
 * Activities
1. Encode, save, compile, execute and understand the program given below.
2. Modify the program so that the following specifications are satisfied (Filename:
MidtermActivity6.java)
a. Only valid values should allow the computer to continue the process
b. The tax due should be determined based on the actual tax computation procedure
for the Philippines. (Please do the necessary data gathering. Search for BIR
information. Borrow income tax forms.)
c. Appropriate comments should be included in the source code
d. Helpful error messages should be shown whenever and wherever appropriate.
 */

import java.lang.*;
import java.util.Scanner;

public class MidtermActivity6 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double taxableIncome;
    double taxDue = 0.0;
    byte bracket = 0;
    System.out.println("Income Tax Computation");
    System.out.print("Enter the taxable income: ");
    taxableIncome = keyboard.nextDouble();

    if (taxableIncome <= 25000.00) bracket = 1;
    if (taxableIncome > 250000.01 && taxableIncome <= 400000) bracket = 2;
    if (taxableIncome > 400000.01 && taxableIncome <= 800000) bracket = 3;
    if (taxableIncome > 800000.01 && taxableIncome <= 2000000) bracket = 4;
    if (taxableIncome > 2000000.01 && taxableIncome <= 8000000) bracket = 5;
    if (taxableIncome > 8000000.01) bracket = 6;

    switch (bracket) {
      case 1:
        taxDue = 0;
        break;
      case 2:
        taxDue = taxableIncome * 0.20;
        break;
      case 3:
        taxDue = 30000 + (taxableIncome * 0.25);
        break;
      case 4:
        taxDue = 130000 + (taxableIncome * 0.30);
        break;
      case 5:
        taxDue = 490000 + (taxableIncome * 0.32);
        break;
      case 6:
        taxDue = 2410000 + (taxableIncome * 0.35);
        break;
      default:
        taxDue = 0.00;
    } // end of switch-case
    if (taxDue > 0) {
      System.out.printf("%s %.2f%n", "Tax Due = s", taxDue);
      System.exit(0);
    } else {
      System.out.println("ERROR");
    }
  } // end of main method
} // end of Taxation class
