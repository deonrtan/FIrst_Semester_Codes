package Midterm.Done;

/*
Grading Program Problem
The numeric prelim grade of a student for a subject is computed by the expression
 ((student's grade for the quizzes) + (student's grade for the examination)) / 2
The grade for the quizzes is computed by the expression
 (student's total quiz scores) / (perfect total quiz score) * 50 + 50
The grade for the examination is computed by the expression
 (student's examination score) / (perfect examination score) * 50 + 50
A corresponding letter grade is given to the student based on the following rules.
 If NUMERIC GRADE is then LETTER GRADE is
 =================== =========================
 >= 50 but < 75 D
 >= 75 but < 80 C
 >= 80 but < 90 B
 >= 90 but <= 100 A
*/

import java.util.Scanner;

public class MidtermExercise2A {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int perfectTotalQuizScore = 0, totalQuizScore = 0, examScore =
      0, perfectExamScore = 0;
    double quizGrade = 0, examGrade = 0, numericGrade = 0;
    char letterGrade = 'I';
    String studentName = "";
    System.out.println(
      "This program helps you compute the prelim grade of a student."
    );
    System.out.println();

    System.out.print("Enter the name of the student: ");
    studentName = input.nextLine(); // 1

    System.out.print("Enter the perfect total quiz score: ");
    perfectTotalQuizScore = input.nextInt(); // 2

    if (perfectTotalQuizScore < 0) {
      System.out.println(
        "Invalid perfect score! The perfect score should be greater than zero"
      );
      System.out.println(
        "Sorry! The program needs to close. Run the program again and enter correct values."
      );
      System.exit(0);
    }

    System.out.print("Enter the total quiz score of " + studentName + ": ");
    totalQuizScore = input.nextInt();

    if (totalQuizScore < 0 || totalQuizScore > perfectTotalQuizScore) {
      System.out.println(
        "Invalid score. The score should not exceed the perfect score " +
        perfectTotalQuizScore +
        " and it should not be less than 0."
      );
      System.out.println(
        "Sorry! The program needs to close. Run the program again and enter correct values."
      );
      System.exit(0);
    }

    System.out.print("Enter the perfect examination score: ");
    perfectExamScore = input.nextInt(); // 3

    if (perfectExamScore < 0) { // 4
      System.out.println(
        "Invalid perfect score! The perfect score should begreater than zero"
      );
      System.out.println(
        "Sorry! The program needs to close. Run the program again and enter correct values."
      );
      System.exit(0);
    }

    System.out.print("Enter the examination score of " + studentName + ": ");
    examScore = input.nextInt(); // 5

    if (examScore > perfectExamScore || examScore < 0) { // 6
      System.out.println(
        "Invalid score. The exam score should not exceed the perfect score " +
        perfectExamScore +
        " and it should not be less than 0."
      );
      System.out.println(
        "Sorry! The program needs to close. Run the program again and enter correct values."
      );
      System.exit(0);
    }

    quizGrade = (double) totalQuizScore / perfectTotalQuizScore * 50 + 50;
    examGrade = (double) examScore / perfectExamScore * 50 + 50;
    numericGrade = (quizGrade + examGrade) / 2; // 7

    if (numericGrade >= 50 && numericGrade < 75) {
      letterGrade = 'D';
    }

    if (numericGrade >= 75 && numericGrade < 80) { // 8
      letterGrade = 'C';
    }

    if (numericGrade >= 80 && numericGrade < 90) { // 9
      letterGrade = 'B';
    }

    if (numericGrade >= 90 && numericGrade <= 100) {
      letterGrade = 'A'; // 10
    }

    System.out.println();
    System.out.printf("%-30s%20s%n", "Name of Student", studentName);
    System.out.printf("%-30s%20d%n", "Total Quiz Score = ", totalQuizScore);
    System.out.printf(
      "%-30s%20d%n",
      "Perfect Total Quiz Score = ",
      perfectTotalQuizScore
    );
    System.out.printf("%-30s%20.0f%n", "Grade for the Quizzes = ", quizGrade);
    System.out.printf("%-30s%20d%n", "Examination Score = ", examScore);
    System.out.printf(
      "%-30s%20d%n",
      "Perfect Examination Score = ",
      perfectExamScore
    );
    System.out.printf("%-30s%20.0f%n", "Grade for the Exam = ", examGrade);
    System.out.println();
    System.out.printf("%-30s%20.0f%n", "Numeric Grade = ", numericGrade);
    System.out.printf("%-30s%20c%n", "Letter Grade = ", letterGrade);
    System.exit(0);
    /*
 * Activities:
1. Based on the following algorithm for the above programming problem, provide the
statements or expressions that should replace the blank lines in the incomplete
program given below. The statements or expressions should be based on the given
parts of the program. (You should not add any statement or expression aside from
those that should replace the blank lines.) One blank line corresponds to one
statement or one expression. (Filename: MidtermExercise2A.java)
2. Modify the program so that if-else statements are used where appropriate.
(Filename: MidtermExercise2B.java)

 */

  } // end of main method
} // end of clas
