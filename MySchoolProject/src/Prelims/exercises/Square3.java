package Prelims.exercises;

/*
Name: Tan, Deon R.
        Programming Date: ___________________
        Activity Name and Number: Prelim Programming Exercise 4 */

import java.lang.*; // class with many uses but at this situation for mathematical expressions
import java.util.Scanner; //calls out the class that access its specific identifiers

// in "Java.util.Scanner" it accesses the identifier that lets you input a number or letters in the program

public class Square3 {

  public static void main(String[] args) {
    // make a variable for the scanner, "input" is a class inside the scanner that lets you input a number/characters in the output
    Scanner input = new Scanner(System.in);

    // if you're inputting whole digit numbers to the variables you can use int or integers
    int sides, area, perimeter;

    // an output to know the instructions
    System.out.println("Type the value of the side of the square : ");
    sides = input.nextInt(); // inputting an integer in the sides variable

    //getting the area of the square by multiplying both sides
    area = sides * sides;

    //getting the perimeter of the square by multiplying the sides by 4
    perimeter = 4 * sides;

    //output of the code
    System.out.println();
    System.out.println();
    System.out.println(" ***************************************");
    System.out.println(" *                                     *");
    System.out.println(" *                                     *");
    System.out.println(" * area of the square = " + area + "             ");
    System.out.println(" * sides of the square = " + sides + "             ");
    System.out.println(
      " * perimeter of the square = " + perimeter + "          "
    );
    System.out.println(" *                                     *");
    System.out.println(" *                                     *");
    System.out.println(" ***************************************");
  } // End of main method
} // end of class
