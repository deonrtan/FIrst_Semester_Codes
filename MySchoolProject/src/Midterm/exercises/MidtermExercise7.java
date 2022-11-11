package Midterm.exercises;

/*
 * (Simplified Water Bill Computation)
The bill for a water service subscriber is prepared as follows:
1. Read the name of the water consumer
2. Read the previous water meter reading in cubic meters (reading last month) from the
consumer’s meter.
 The meter reading cannot be less than zero.
3. Read the present water meter reading in cubic meters (reading this month) from the
consumer’s meter.
 The present water meter reading cannot be less than the previous water meter reading.
4. Compute the volume of water consumed (consumption = CMUSed) by subtracting the
previous reading from the present reading.
5. Read the classification of the consumer (c for commercial or r for residential)
6. Compute the amount due from the consumer. The amount due is computed based on the
following
For residential consumers
If Cubic Meters Consumed is then Amount Due (pesos)
==============================================
Less than or equal to 12 180.00
More than 12 180.00 + (cubicMetersConsumed – 12) * 30.00
For commercial consumers
If Cubic Meters Consumed is then Amount Due (pesos)
==============================================
Less than or equal to 30 600.00
More than 30 600.00 + (cubicMetersConsumed – 30) * 50.00
7. Print a bill statement. The bill statement should show the name of the subscriber, the readings,
 the consumption and the amount due.

 */

import java.util.Scanner;

public class MidtermExercise7 {

  public static void main(String[] args) {
    int presentReading = 0, previousReading = 0;
    Scanner keyboard = new Scanner(System.in);
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
    consumer = keyboard.nextLine();
    do {
      System.out.print("Enter the meter reading last month: ");
      previousReading = Integer.parseInt(keyboard.nextLine());
      if (previousReading < 0) {
        System.out.println("The meter reading cannot me negative.");
      }
    } while (previousReading < 0);
    // insert statements below…
  } // end of main
}
