package Midterm.Done;

import java.util.Scanner;

public class MidtermExercise7 {

  public static void main(String[] args) {
    int presentReading = 0, previousReading = 0;
    Scanner kbd = new Scanner(System.in);
    String consumer = ""; // to hold name of consumer
    char cType = 'x'; // to hold type of consumer
    int nCMUsed; // to hold number of cubic meters ofwater used
    int minCMResidential = 12; // to hold cut-off for minimum Bill forresidential consumers
    double minBillResidential = 180.00; // minimum bill for <= 12 Cubic Meters used
    float rateResidential = 30.00F; // cost of 1 Cubic Meter above the min.consumption
    int minCMCommercial =
      30;/* to hold cut-off for minimum Bill for commercial consumers */
    double minBillCommercial = 600.00; // minimum bill for <= 20Cubic Meters used
    float rateCommercial =
      50.00F;/* cost of 1 Cubic Meter above the min.consumption for commercial consumers */
    double amountDue = 0.0; // to hold the amount due

    System.out.print("Enter the consumer's name: ");
    consumer = kbd.nextLine();
    do {
      System.out.print("Enter the meter reading last month: ");
      previousReading = Integer.parseInt(kbd.nextLine());
      if (previousReading < 0) {
        System.out.println("The meter reading cannot me negative.");
      }
    } while (previousReading < 0);
    // insert statements below…
    do {
      System.out.print("Enter the meter reading this month: ");
      presentReading = kbd.nextInt();
      if (presentReading < previousReading) {
        System.out.println(
          "The present meter reading cannot be less than the previous water meter readings"
        );
      }
    } while ((presentReading < previousReading));

    nCMUsed = presentReading - previousReading;

    System.out.print(
      "Enter the type of consumer you are: |c for commercial| |r for residential|: "
    );
    cType = kbd.next().charAt(0);
    switch (cType) {
      case 'c':
      case 'C':
        if (nCMUsed <= minCMCommercial) {
          amountDue = minBillCommercial;
        } else if (nCMUsed > minCMCommercial) {
          amountDue =
            minBillCommercial + (nCMUsed - minCMCommercial) * rateCommercial;
        }
        break;
      case 'r':
      case 'R':
        if (nCMUsed <= minCMResidential) {
          amountDue = minBillResidential;
        } else if (nCMUsed > minCMResidential) {
          amountDue =
            minBillResidential + (nCMUsed - minCMResidential) * rateResidential;
        }
        break;
    }
    System.out.println("Bill Statement");
    System.out.println();
    System.out.println("Consumers Name : " + consumer);
    System.out.println("Readings : " + nCMUsed);
    System.out.println("Consumption : " + cType);
    System.out.println("Amount due : " + amountDue + " Pesos");
  }
} // end of main
