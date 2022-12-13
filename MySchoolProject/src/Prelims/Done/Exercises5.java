package Prelims.Done;

import java.util.Scanner; // specifically just using the Scanner

public class Exercises5 { // start of class

  public static void main(String[] args) { // so that the program will run in the IDE
    // make a variable for the scanner, "input" is a class inside the scanner that lets you input a number/characters in the output
    Scanner input = new Scanner(System.in);

    // get keyboard input for three integers
    System.out.print("First Number: ");
    int n1 = input.nextInt();
    System.out.print("Second Number: ");
    int n2 = input.nextInt();
    System.out.print("Third Number: ");
    int n3 = input.nextInt();

    // "n1" = first number
    // "n2" = second number
    // "n3" = third number

    // displaying the three numbers
    System.out.println(
      "You entered the numbers " + n1 + ", " + n2 + " and " + n3
    );
    // add the three numbers and store it in another int variable named "sum"

    // #1 displaying the sum of the three numbers and inputting it the to variable integer named sum
    int sum = n1 + n2 + n3; // the formula
    // showing the sum of the three numbers
    System.out.println("The sum of the three numbers is " + sum);

    // dividing the inputted value of the first number to the second and displaying the value as an integer
    int quotient1 = n1 / n2; // formula for getting quotient of n1 and n2
    // Showing the output of the value of the division of number 1 to the number 2
    System.out.println(
      "number 1 = " + n1 + " / number 2 = " + n2 + " =  " + quotient1
    );

    // dividing the inputted value of the first number to the second and displaying the value as a double
    double quotient2 = n1 / n2; // formula for getting the exact quotient value of n1 and n2
    // Showing the output of the value of the division of number 1 to the number 2. that shows the exact value
    System.out.println(
      "number 1 = " + n1 + " / number 2 = " + n2 + " =  " + quotient2
    );

    // #1 product of the three numbers
    int prod = n1 * n2 * n3; // the formula
    // showing the product of the three numbers
    System.out.println("\nThe product of the three numbers is " + prod);

    // #2 adding the first two numbers and dividing it by the third number and the output that we'll be showing is an integer or whole number
    int integerQuotient = ((n1 + n2) / n3); // the formula
    // showing the sum of the first 2 numbers divided by the third number
    System.out.println(
      "\nThe expression used computed the integer quotient of (num1+num2)/num3 = " +
      integerQuotient
    );

    // #3 adding the first two numbers and dividing it by the third number and the output that we'll be showing is the exact quotient
    double exactQuotient = ((n1 + n2) / n3); //the formula for adding the two numbers and dividing it by the third number
    System.out.println(
      "\nThe expression used computed the exact quotient of (num1+num2)/num3 = " +
      exactQuotient
    );

    // #4 average of three numbers and displaying the results with 2 decimal points
    // & meaning in java
    double average = ((n1 + n2 + n3 / 3)); // by getting the average the formula is as shown the inputted values on n1,n2,n3 will be divided by 3
    // the total numbers of variable that is used to get the average
    System.out.println(
      "the average of three numbers = " + String.format("%.2f", average)
    );

    // showing the average of the three numbers with 2 decimal points
    System.out.println(
      "The average of the three numbers that displays by only 2 decimal points " +
      average
    );

    // #5 computing the square of each number by using a class in java called "Math" Specifically in Math.pow it is used to input an exponential to an integer
    // for example (x,2) x determines the integer and 2 determines the exponential  so the output will be x^2

    double square1 = Math.pow(n1, 2);
    double square2 = Math.pow(n2, 2);
    double square3 = Math.pow(n3, 2);
    // square of the first number
    System.out.println("\nSquare of the first number is " + square1);
    // square of the second number
    System.out.println("\nSquare of the second number is " + square2);
    // square of the third number
    System.out.println("\nSquare of the third number is " + square3);
  } // end of main method
} // end of class
