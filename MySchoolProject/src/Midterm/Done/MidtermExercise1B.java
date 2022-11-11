package Midterm.Done;

import java.lang.*;
import java.util.Scanner;

/*
 Modify your completed program such that the following are enforced. Save your final program
in an electronic folder that you will eventually submit.
(Filename: MidtermExercise1B.java)
a) “while” statements are used instead of “do-while” statements
b) Aside from being no greater than the perfect quiz score, the quiz score to be entered
should not be a negative value. An appropriate message should be displayed in case the
user enters a negative quiz score and the user should be allowed to enter a new value.
c) Aside from being no greater than the perfect exam score, the exam score to be entered
should not be a negative value. An appropriate message should be displayed in case the
user enters a negative exam score and the user should be allowed to enter a new value.

d) “if-else” statements should be used where appropriate.
 */

public class MidtermExercise1B {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int quizScore;
    int examScore;
    int perfectQuizScore;
    int perfectExamScore;
    double quizGrade;
    double examGrade;
    double prelimGrade;

    do {
      System.out.print("Enter the Perfect Total Quiz Score: ");
      perfectQuizScore = input.nextInt(); // 4
      if (perfectQuizScore <= 0) {
        System.out.println("Invalid value! Value must be greater than 0.");
      }
    } while (perfectQuizScore <= 0);

    do {
      System.out.print("Enter the Perfect Examination Score: ");
      perfectExamScore = input.nextInt(); // 5
      if (perfectExamScore <= 0) {
        System.out.println("Invalid value! Value must be greater than 0.");
      }
    } while (perfectExamScore <= 0);

    /*
     * b) Aside from being no greater than the perfect quiz score, the quiz score to be entered
should not be a negative value. An appropriate message should be displayed in case the
user enters a negative quiz score and the user should be allowed to enter a new value.
     */
    do {
      System.out.print("Enter a student's total quiz score : ");
      quizScore = input.nextInt();
      if (quizScore < 0) {
        System.out.println("The Quiz Score should not be negative");
      }
      if (quizScore > perfectQuizScore) {
        System.out.println(
          "The quiz score should not be greater than the perfect quiz score"
        );
      }
    } while (quizScore < 0 || quizScore > perfectQuizScore);

    do {
      System.out.print("Enter a student's examination score : ");
      examScore = input.nextInt(); // 7
      if (examScore > perfectExamScore) {
        System.out.println(
          "Invalid value! Score must not be greater than perfect score."
        );
      }
    } while (examScore > perfectExamScore);

    quizGrade = (quizScore / perfectQuizScore) * 50 + 50;

    examGrade = (examScore / perfectExamScore) * 50 + 50;

    prelimGrade = (quizGrade + examGrade) / 2;

    if (prelimGrade >= 99) {
      prelimGrade = 99;
    }

    if (prelimGrade <= 65) {
      prelimGrade = 65;
    }

    if (prelimGrade >= 75) {
      System.out.println(prelimGrade);
      System.out.println(" Remark : PASSED");
    } else if (prelimGrade < 75) {
      System.out.println(prelimGrade);
      System.out.println("Remark : FAILED");
    } else {
      System.out.println("System Error");
    }

    System.exit(0);
  }
}
