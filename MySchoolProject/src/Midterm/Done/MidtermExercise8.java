package Midterm.Done;

/*
 * Test the program given below with different possible input values. Note that the program allows
the computer to determine and show the roots of a quadratic equation after the computer is given
the numerical coefficients of the quadratic equation. Note further that if the roots of the quadratic
equation are imaginary, the program gives a String representation of the imaginary roots. The
given program is written such that aside from the main method, other methods are included.
However, you may not mind the other methods at this point. Focus on seeing and
understanding sample runs of the program.
Required:
Rewrite the following program such that the program has only the main method. The re-written
program should have the same result/output as the given program. (Filename:
MidtermExercise8.java)
 */
import java.util.Scanner;

public class MidtermExercise8 {

  public static void main(String[] args) {
    double a, b, c;
    Scanner keyboard = new Scanner(System.in);
    printHeading(); // invoke printHeading method
    System.out.print("Enter a: ");
    a = Double.parseDouble(keyboard.nextLine());
    System.out.print("Enter b: ");
    b = Double.parseDouble(keyboard.nextLine());
    System.out.print("Enter c: ");
    c = Double.parseDouble(keyboard.nextLine());
    if (b * b - 4 * a * c >= 0) determineAndShowTheRealRoots(
      a,
      b,
      c
    ); else determineAndShowTheImaginaryRoots(a, b, c);
    System.exit(0);
  }

  public static void printHeading() {
    System.out.println(
      "This program helps you solve for the roots of a Quadratic Equation."
    );
    System.out.println(
      "You should enter the coefficients of the quadratic equation"
    );
    return;
  }

  public static double computeFirstRoot(double a, double b, double c) {
    double root = 0.0; // local variable with initial value
    root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    return root;
  }

  public static double computeSecondRoot(double a, double b, double c) {
    double root = 0.0; // local variable with initial value
    root = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    return root;
  }

  public static void showRealRoots(double r1, double r2) {
    System.out.println("The roots are: " + r1 + " and " + r2 + ".");
    return;
  }

  public static String representFirstImaginaryRoot(
    double a,
    double b,
    double c
  ) {
    String root = "";
    root +=
      -b /
      (2 * a) +
      " + (square root of (" +
      (-1) *
      (b * b - 4 * a * c) +
      ") * i) / " +
      (2 * a);
    return root;
  }

  public static String representSecondImaginaryRoot(
    double a,
    double b,
    double c
  ) {
    String root = "";
    root +=
      -b /
      (2 * a) +
      " - (square root of (" +
      (-1) *
      (b * b - 4 * a * c) +
      ") * i) / " +
      (2 * a);
    return root;
  }

  public static void showImaginaryRoots(String r1, String r2) {
    System.out.println("The imaginary roots are: " + r1 + " and " + r2 + ".");
    return;
  }

  public static void determineAndShowTheRealRoots(
    double a,
    double b,
    double c
  ) {
    double root1 = computeFirstRoot(a, b, c); // invoke computeFirstRoot method
    double root2 = computeSecondRoot(a, b, c); // invoke computeSecondRoot method
    showRealRoots(root1, root2); // Invoke showRoots method
    return;
  }

  public static void determineAndShowTheImaginaryRoots(
    double a,
    double b,
    double c
  ) {
    String root1 = representFirstImaginaryRoot(
      a,
      b,
      c
    );/* invoke represent First ImaginaryRootmethod */
    String root2 = representSecondImaginaryRoot(
      a,
      b,
      c
    );/* invoke method representSecondImaginaryRoot */
    showImaginaryRoots(root1, root2); // invoke showImaginaryRootsmethod
    return;
  }
}
