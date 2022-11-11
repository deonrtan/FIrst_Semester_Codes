package Midterm.Done;

import java.lang.*;
import java.util.Scanner;

public class MidtermExercise1A {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int quizScore; // declare an int variable to hold total quiz score
    int examScore; // declare an int variable to hold exam score
    int perfectQuizScore; // declare an int variable to hold perfect total quiz score
    int perfectExamScore; // declare an int variable to hold perfect exam score
    double quizGrade; // 1. declare a double variable to hold quiz grade.
    double examGrade; // 2. declare a double variable to hold examination grade
    double prelimGrade; // 3. declare a double variable to hold the prelim grade
    /* Accept the perfect total quiz score. The perfect score must be greater than 0. The do while construct
enables the computer to let the user re-enter a perfect score in case the value entered is invalid. */

    do {
      System.out.print("Enter the Perfect Total Quiz Score: ");
      perfectQuizScore = reader.nextInt(); // 4
      if (perfectQuizScore <= 0) {
        System.out.println("Invalid value! Value must be greater than 0.");
      }
    } while (perfectQuizScore <= 0);
    /* Accept the perfect exam score. The perfect score must be greater than 0. The do while construct
enables the computer to let the user re-enter a perfect score in case the value entered is invalid. */

    do {
      System.out.print("Enter the Perfect Examination Score: ");
      perfectExamScore = reader.nextInt(); // 5
      if (perfectExamScore <= 0) {
        System.out.println("Invalid value! Value must be greater than 0.");
      }
    } while (perfectExamScore <= 0);
    /* Accept the total quiz score. The total quiz score must not be greater than the perfect quiz score. The
do while construct enables the computer to let the user re-enter a score in case the value entered
is invalid. */

    do {
      System.out.print("Enter a student's total quiz score : ");
      quizScore = reader.nextInt(); // 6
      if (quizScore > perfectQuizScore) {
        System.out.println(
          "Invalid value! Score must not be greater than perfect score."
        );
      }
    } while (quizScore > perfectQuizScore);
    /* Accept the exam score. The exam score must not be greater than the perfect exam score. The do
while construct enables the computer to let the user re-enter a score in case the value entered is
invalid. */

    do {
      System.out.print("Enter a student's examination score : ");
      examScore = reader.nextInt(); // 7
      if (examScore > perfectExamScore) {
        System.out.println(
          "Invalid value! Score must not be greater than perfect score."
        );
      }
    } while (examScore > perfectExamScore);
    // Compute the quiz grade
    quizGrade = (quizScore / perfectQuizScore) * 50 + 50; // 8
    // Compute the exam grade
    examGrade = (examScore / perfectExamScore) * 50 + 50; // 9
    // Compute the subject grade
    prelimGrade = (quizGrade + examGrade) / 2; // 10
    // Check if prelim grade is greater than 99 then reset it to 99
    if (prelimGrade > 99) {
      prelimGrade = 99; // 11
    }
    //Check if prelim grade is less than 65 then reset it to 65
    if (prelimGrade < 65) {
      prelimGrade = 65; // 12
    }
    // Check if prelim grade is passing then display the grade together with a remark
    if (prelimGrade >= 75) { // 13
      System.out.print(prelimGrade); // 14
      System.out.println(" Remark : PASSED");
    }
    // Check if prelim grade is failing then display the grade together with a remark
    if (prelimGrade < 75) { //15
      System.out.println(prelimGrade);
      System.out.println("Remark : FAILED"); // 15
    }
    System.exit(0);
  } // end of the main method
} // end of class
