package Prelims.exercises;

/*
Name: Tan, Deon R.
        Programming Date: 9/8/2022
        Activity Name and Number: Prelim Programming Exercise 4 */

import java.lang.*; // common variables & mathematical expressions
import java.util.Scanner; // specifically just using the Scanner

public class RightTriangle3 { // start of class

  public static void main(String[] args) { // special method in Java Programming that serves as the externally exposed entrance point by which a Java program can be run.
    Scanner input = new Scanner(System.in); // make a variable for the scanner, "input" is a class inside the scanner that lets you input a number/characters in the output

    // if you're inputting whole digit numbers to the variables you can use int or integers in here i'll be using int for my base and height
    int Base, Height;

    //on getting the exact digits of this two variables we use double, double specifically means we add 15 floating points to the digits
    // I use double in this situation is because we use a mathematical symbol of square root
    double Hypotenuse;

    // an output to know the instructions
    System.out.println("Enter the value of the Height of the Triangle");
    Height = input.nextInt(); //Assigns a value to Height of the right triangle.

    // an output to know the instructions
    System.out.println("Enter the value of the Base of the Triangle");
    Base = input.nextInt(); //Assigns a value to Base of the right triangle.

    //variable that indicates the Hypotenuse of the Right Triangle
    Hypotenuse = Math.sqrt(Math.pow(Height, 2) + Math.pow(Base, 2)); //The formula of the Hypotenuse based on the Pythagorean Theorem is
    // c = √(a^2 + b^2) which is "a" is the base, b is the "height" and "c" is the hypotenuse so by getting this we must square root the sum of a squared and b squared to get the hypotenuse

    //this is the output of the code

    System.out.println();
    System.out.println();
    System.out.println(
      " **********************************************************"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " * Height of Right Triangle is " + Height + "                         "
    );
    System.out.println(
      " * Base of the right triangle is  " + Base + "                      "
    );
    System.out.println(
      " * Hypotenuse of the right triangle is " + Hypotenuse + "  "
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " **********************************************************"
    );
  } // end of main method
} // end of class
