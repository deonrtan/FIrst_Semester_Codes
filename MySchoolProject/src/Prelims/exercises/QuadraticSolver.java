package Prelims.exercises;

import java.lang.*;
import java.util.*;

/*
Algorithm
    1. Let a represent the coefficient of x squared
      2. Let b represent the coefficient of x
      3. Let c represent in constant
      4. Let root1 represent the first root
      5. Let root2 represent the second root
      6. Show an introduction of the application/program
      7. Read the value of a
      8. Read the value of b
      9. Read the value of c
      10. Compute root1: root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a)
      11. Compute root2: root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a)
      12. Display the roots.
      */

public class QuadraticSolver {

  public static void main(boolean invoke) {
    Scanner input = new Scanner(System.in);

    double a, b, c;
    double root1, root2;
    System.out.println("Enter the coefficient of x^2 (a): ");
    a = input.nextDouble();
    System.out.println("Enter the coefficient of x (b): ");
    b = input.nextDouble();
    System.out.println("Enter the constant (c)");
    c = input.nextDouble();

    double first_root = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    double second_root = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    System.out.printf(
      "%c%.2f%s%.2f%s%.2f%s%.2f%s%.2f%c%n",
      '(',
      a,
      ") + (",
      b,
      ") + (",
      c,
      ") = 0 are ",
      first_root,
      " and ",
      second_root,
      '.'
    );
  }
}
