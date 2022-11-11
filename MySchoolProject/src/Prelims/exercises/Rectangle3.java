package Prelims.exercises;

/*
Name: Tan, Deon R.
        Programming Date: 9/8/2022
        Activity Name and Number: Prelim Programming Exercise 4 */

import java.util.Scanner; //calls out the class that access its specific identifiers

// in "Java.util.Scanner" it accesses the identifier that lets you input a number or letters in the program

public class Rectangle3 {

  public static void main(String[] args) {
    // if you're inputting whole digit numbers to the variables you can use int or integers
    int length, width, perimeter, area;

    // make a variable for the scanner, "input" is a class inside the scanner that lets you input a number/characters in the output
    Scanner input = new Scanner(System.in);

    // instructions on getting the length
    System.out.println("Enter the length of the rectangle : ");

    length = input.nextInt(); // inputting an integer in the length variable

    // instructions on getting the width
    System.out.println("Enter the width of the rectangle : ");

    width = input.nextInt(); // inputting an integer in the width variable

    // getting the perimeter of the rectangle by multiplying the length by 2 and also multiplying the width by 2 and adding them together
    perimeter = (2 * length) + (2 * width);

    // by getting the area of the rectangle we must multiply the length and the width
    area = length * width;

    //output of the code
    System.out.println();
    System.out.println();
    System.out.println(" ***************************************");
    System.out.println(" *                                     *");
    System.out.println(" *                                     *");
    System.out.println(" * Length of the rectangle = " + length + "        ");
    System.out.println(" * width of the rectangle = " + width + "         ");
    System.out.println(
      " * perimeter of the rectangle = " + perimeter + "     "
    );
    System.out.println(" * area of the rectangle = " + area + "         ");
    System.out.println(" *                                     *");
    System.out.println(" *                                     *");
    System.out.println(" ***************************************");
  } // End of main method
} // end of class
