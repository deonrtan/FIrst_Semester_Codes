package Midterm.Done;

/*
 * Save your final program in an electronic folder that you will eventually submit.
Test the program given below with different possible input values. Note that the program requires
the user to enter 10 pairs of grades and number of units. Note also that the program allows the user
to enter invalid values. Note further that the computation process involved is repetitive and that
the computation process can be handled by a loop construct.
Required:
Write another version of the program so that the following specifications are satisfied:
• The number of pairs of grades and units is an input value at run time. Hence, the
program may be used to compute the average of 5 grades, 8 grades, 10 grades, etc.
• There are validation processes for the input values. Grades must be integers from 65 to
99. The number of units must be at least 1 but not more than 12. If an input value is
invalid, the user should be given a directive to enter another value and that processing
will continue after the user enters a valid value.
• The repetitive computation process is handled using an iteration construct. (while, dowhile or for construct)
• The computer will display a running average after every pair of grades and units is
entered. The running average is the average of the grades entered so far.
 */
import java.util.Scanner;

public class MidtermExercise5 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int counter = 1;
    int grade = 0;
    int units = 0;
    int totalGrade = 0;
    int totalUnits = 0;
    double average = 0.0;

    System.out.println("Calculating your GWA\n");
    System.out.println("How many subjects do you have?");
    int length = keyboard.nextInt();

    for (int i = 0; i < length; i++) {
      do {
        System.out.print(
          "Enter the grade of the student for the subject " + counter + ": "
        );
        grade = keyboard.nextInt();
        if (grade < 65) {
          System.out.println("Grades must not be less than 65");
        }
        if (grade > 100) {
          System.out.println("Grades must not be greater than 100");
        }
      } while (grade < 65 || grade > 100);

      do {
        System.out.print(
          "Enter the number of units for the subject " + counter + ": "
        );
        units = keyboard.nextInt();
        if (units <= 1) {
          System.out.println("Units must not be less than 1");
        }
        if (units >= 12) {
          System.out.println("Units must not be greater than 12");
        }
      } while (units < 1 || units > 12);
      System.out.println();
      totalGrade += grade * units;
      totalUnits += units;
      counter += 1;
    }

    average = (double) totalGrade / totalUnits;
    System.out.printf("%s%.2f%n", "Average Grade = ", average);
    System.exit(0);
  }
}
