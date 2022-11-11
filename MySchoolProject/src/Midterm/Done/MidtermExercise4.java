package Midterm.Done;

import java.lang.String;
import java.util.List;
/*
 * Save your final program in the appropriate folder that you will eventually submit.
Test the program given below with different possible input values. Note that the program allows
the user to enter invalid values (0 or negative number for the quantity, 0 or negative number for
the unit price, etc.). In addition, the program allows the user to enter a cash tendered amount that
is lesser that the amount to be paid.
Required:
Write an improved version of the program that will provide validation processes for the input
values. The following should be imposed: (Filename: MidtermExercise4.java)
✓ The valid product names should be limited to only 5 product names ( e.g. “pen”, “pencil”,
“short bond paper”, “long bond paper”, “pad paper”)
✓ The quantity cannot be a negative number.
✓ The unit price must be greater than zero
✓ The discount rate cannot be negative and it cannot be more than 100 percent.
✓ The amount tendered cannot be lower than the amount to be paid.
If an input value is invalid, the user should be given an appropriate error message and a directive
to enter another value. The user may repeatedly supply an invalid value. The processing should
continue only after the user enters a valid value.
 */

import java.util.Scanner;

public class MidtermExercise4 {

  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String pName = "";
    double uPrice, totalCost, discount, discountedCost, amountTendered, change;
    int qty, dRate;

    int y = 1;

    for (int i = 0; i < y; i++) {
      String[] products = new String[5];
      products[0] = "pen";
      products[1] = "pencil";
      products[2] = "short bond paper";
      products[3] = "long bond paper";
      products[4] = "pad paper";
      do {
        System.out.print("Product: ");
        pName = kbd.nextLine();
        if (pName.equals(products[0])) {
          System.out.println("You have chosen pen");
          pName = products[0];
        } else if (pName.equals(products[1])) {
          System.out.println("You have chosen pencil");
          pName = products[1];
        } else if (pName.equals(products[2])) {
          System.out.println("You have chosen short bond paper");
          pName = products[2];
        } else if (pName.equals(products[3])) {
          System.out.println("You have chosen long bond paper");
          pName = products[3];
        } else if (pName.equals(products[4])) {
          System.out.println("You have chosen pad paper");
          pName = products[4];
        } else {
          System.out.println("Error");
        }
      } while (
        pName != products[0] &&
        pName != products[1] &&
        pName != products[2] &&
        pName != products[3] &&
        pName != products[4]
      );

      do {
        System.out.print("Quantity: ");
        qty = Integer.parseInt(kbd.nextLine());
        if (qty < 0) {
          System.out.println("quantity must not be less than 0");
          System.out.println("Type another number");
        }
      } while (qty < 0);

      do {
        System.out.print("Unit Price: ");
        uPrice = Double.parseDouble(kbd.nextLine());
        if (uPrice < 0) {
          System.out.println("Unit Price must not be less than 0");
          System.out.println("Type another number");
        }
      } while (uPrice < 0);

      do {
        System.out.print("Discount: ");
        dRate = Integer.parseInt(kbd.nextLine());
        if (dRate > 100) {
          System.out.println("The discount cannot be more than 100");
          System.out.println("Type another number");
        }
        if (dRate < 0) {
          System.out.println("The discount cannot be negative");
          System.out.println("Type another number");
        }
      } while (dRate > 100 || dRate < 0);

      totalCost = uPrice * qty;
      discount = totalCost * (dRate / 100.0);
      discountedCost = totalCost - discount;

      System.out.println(
        "The amount you're going to pay is: " + discountedCost
      );

      System.out.println("How much are you going to pay?");

      do {
        System.out.print("Cash Tendered: ");
        amountTendered = Double.parseDouble(kbd.nextLine());
        if (amountTendered < discountedCost) {
          System.out.println(
            "The amount you're going to pay must be greater than the price"
          );
        }
      } while (amountTendered < discountedCost);

      change = amountTendered - discountedCost;

      System.out.printf("%-25s%12s%n", "Product Name: ", pName);
      System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
      System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
      System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
      System.out.printf("%-25s%12.2f%n", "change: ", change);
      System.out.println();

      System.out.println("\nDo you want to compute again<Y/N>?");
      char answer = kbd.next().charAt(0);

      if (answer == 'Y' || answer == 'y') {
        y++;
      } else {
        System.out.println("\nThanks for using my program :)");
      }
    }
  } // end of main method
} // end of method
