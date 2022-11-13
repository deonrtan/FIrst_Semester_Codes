package Z;

import java.util.Scanner;

class highest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int length;
    System.out.println("How many numbers are you going to input?");
    length = input.nextInt();
    int[] grades = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.println("Enter element" + (i + 1));
      grades[i] = input.nextInt();
    }

    int highest = grades[0];
    int lowest = grades[0];

    for (int i = 0; i < grades.length; i++) {
      if (grades[i] > highest) {
        highest = grades[i];
      } else if (grades[i] < lowest) {
        lowest = grades[i];
      }
    }

    System.out.println("Highest Grade: " + highest);
    System.out.println("Lowest: " + lowest);
  }
}
