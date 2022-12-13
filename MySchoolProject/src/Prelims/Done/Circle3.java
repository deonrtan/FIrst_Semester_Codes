package Prelims.Done;

/*
Name: Tan, Deon R.
        Programming Date: 9/8/2022
        Activity Name and Number: Prelim Programming Exercise 4 */

import java.util.Scanner; //calls out the class that access its specific identifiers

// in "Java.util.Scanner" it accesses the identifier that lets you input a number or letters in the program

public class Circle3 { // start of class

  public static void main(String[] args) { // // special method in Java Programming that serves as the externally exposed entrance point by which a Java program can be run.
    try ( // make an variable for the scanner, "input" is a class inside the scanner that lets you input a number/characters in the output
      Scanner input = new Scanner(System.in)
    ) {
      // an integer of radius
      int radius;

      // using double because of PI. To know the exact results to get the circumference and area of the circle
      double circumference;
      double areaOfCircle;

      // an output to know the instructions
      System.out.print(
        "Type the value of the radius of your circle then press the enter key: "
      );

      // line of code that lets you input an "int" at the output
      // can use radius = Integer.parseInt(input.nextLine());
      // radius = Integer.parseInt(readString); for inputting strings
      radius = input.nextInt();

      // Mathematical expression represent a value that is assigned to the variable circumference
      circumference = 2 * Math.PI * radius;

      // A mathematical expression represents a value that is assigned to the variable areaOfCircle
      areaOfCircle = Math.PI * Math.pow(radius, 2);

      // The succeeding statements prints strings on the output screen
      System.out.println();
      System.out.println();
      System.out.println(
        " ***********************************************************"
      );
      System.out.println(" * Radius of circle is " + radius + " ");
      System.out.println(
        " * Circumference of circle is " + circumference + " "
      );
      System.out.println(" * Area of circle is " + areaOfCircle + " ");
    }

    System.out.println(
      " **********************************************************"
    );
  } // end of main method
} // end of class
