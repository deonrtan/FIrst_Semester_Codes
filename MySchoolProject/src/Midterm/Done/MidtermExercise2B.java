package Midterm.Done;

import java.util.Scanner;

public class MidtermExercise2B {

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
    } else if (numericGrade >= 75 && numericGrade < 80) { // 8
      letterGrade = 'C';
    } else if (numericGrade >= 80 && numericGrade < 90) { // 9
      letterGrade = 'B';
    } else if (numericGrade >= 90 && numericGrade <= 100) {
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
  } // end of main method
} // end of clas
