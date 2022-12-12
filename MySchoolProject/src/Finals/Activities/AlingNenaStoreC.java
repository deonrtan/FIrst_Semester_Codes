package Finals.Activities;

/*
 * Required:
Write an improved version of the program below such that there are validation processes for the input values
and that appropriate methods are used. The improved version should be named <FinalExercise6.java>. The
improved program should have other methods aside from the main method. The following should be imposed:

 */

import java.util.Scanner;

public class AlingNenaStoreC {

  public static void main(String[] args) {
    alingNenaStore();
    CallingCard();
  }

  public static void CallingCard() {
    String name = "Tan, Deon R.";
    String cp = "09695128980";
    String email = "deonroblestan@gmail.com";
    String address = "Aurora Hill";

    System.out.println("*****************************************************");
    System.out.println("*                 My Calling Card                   *");
    System.out.println("*                                                   *");
    System.out.println("* Programmer       : " + name + "                   *");
    System.out.println("* Cellphone Number : " + cp + "                    *");
    System.out.println("* Email Address    : " + email + "        *");
    System.out.println(
      "* Address          : " + address + "                    *"
    );
    System.out.println("*                                                   *");
    System.out.println("*                                                   *");
    System.out.println("*****************************************************");
    System.exit(0);
  }

  public static void showResults(
    double discount,
    double totalCost,
    double discountedCost,
    double change
  ) {
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

  //use to input a positive integer
  public static int inputPositive() {
    Scanner keyboard = new Scanner(System.in);
    int value;
    System.out.println();

    do {
      value = Integer.parseInt(keyboard.nextLine());

      if (value <= 0) {
        System.out.println("Invalid input. Must be a positive integer");
        System.out.print("Please enter a valid value: ");
      }
    } while (value <= 0);

    return value;
  } // end of inputPositive method

  public static int inputPositive2() {
    Scanner keyboard = new Scanner(System.in);
    int value;
    System.out.println();

    do {
      value = Integer.parseInt(keyboard.nextLine());

      if (value < 0) {
        System.out.println("Invalid input. Must be a positive integer");
        System.out.print("Please enter a valid value: ");
      }
    } while (value < 0);

    return value;
  } // end of inputPositive method

  //use to input a positive double
  public static double inputPositiveD() {
    Scanner keyboard = new Scanner(System.in);
    double value;
    do {
      value = Double.parseDouble(keyboard.nextLine());

      if (value <= 0) {
        System.out.println("Invalid input. Must be a positive integer");
        System.out.print("Please enter a valid value: ");
      }
    } while (value <= 0);

    return value;
  } // end of inputPositiveD method

  public static void alingNenaStore() {
    Scanner kbd = new Scanner(System.in);

    String pName = "";
    double uPrice, totalCost, discount, discountedCost, amountTendered, change;
    int qty, dRate;
    int y = 1;

    for (int i = 0; i < y; i++) {
      System.out.print("Pick a Product : ");
      String[] products = new String[5];
      products[0] = "pen";
      products[1] = "pencil";
      products[2] = "short bond paper";
      products[3] = "long bond paper";
      products[4] = "pad paper";
      do {
        System.out.println("Pick a Product : ");
        System.out.println("-----------------");
        System.out.println();
        System.out.println(
          "'pen' , 'pencil' , 'short bond paper' ,  'long bond paper' , 'pad paper' "
        );
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

      System.out.print("Quantity: ");
      qty = inputPositive();

      System.out.print("Unit Price: ");
      uPrice = inputPositive2();

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
      showResults(discount, totalCost, discountedCost, change);
    }
  }
}
