package Finals.Activities;

/*
 * Required:
Write an improved version of the program below such that there are validation processes for the input values
and that appropriate methods are used. The improved version should be named <FinalExercise6.java>. The
improved program should have other methods aside from the main method. The following should be imposed:
✓ The product name should be the same as one of the product names contained in a given array of strings.
(Hint: Store the names of the valid products in an array and apply the linear search algorithm to check if
an input product is in the array)
✓ The quantity cannot be a negative number.
✓ The unit price must be greater than zero
✓ The discount rate cannot be negative and it cannot be more than 100 percent.
✓ The amount tendered cannot be lower than the amount to be paid.
If an input value is invalid, the user should be given an appropriate error message and a directive to enter
another value. The user may repeatedly supply an invalid value. The processing should continue only if the user
enters a valid value.
 */

import java.util.Scanner;

public class AlingNenaStoreC {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String pName = "";
    double uPrice, totalCost, discount, discountedCost, amountTendered, change;
    int qty, dRate;
    System.out.print("Product: ");
    pName = keyboard.nextLine();
    System.out.print("Quantity: ");
    qty = Integer.parseInt(keyboard.nextLine());
    System.out.print("Unit Price: ");
    uPrice = Double.parseDouble(keyboard.nextLine());
    System.out.print("Discount: ");
    dRate = Integer.parseInt(keyboard.nextLine());
    totalCost = uPrice * qty;
    discount = totalCost * (dRate / 100.0);
    discountedCost = totalCost - discount;
    System.out.print("Cash Tendered: ");
    amountTendered = Double.parseDouble(keyboard.nextLine());
    change = amountTendered - discountedCost;
    System.out.printf(
      "%-25s%12s%n",
      "----------------------",
      "--------------"
    );
    System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
    System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
    System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
    System.out.printf("%-25s%12.2f%n", "change: ", change);
    System.exit(0);
  }
}
