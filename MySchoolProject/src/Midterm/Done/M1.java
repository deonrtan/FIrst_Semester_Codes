package Midterm.Done;

import java.lang.*;
import java.util.Scanner;

/*
Name : Deon Tan
Date:  9/24/2022

 */

/*
Create a program that computes and displays the grade that is corresponding

         to a given score based on the following specifications:

         The grade is the integer value of (rawScore/perfectScore * 50 +50 )

         The perfectScore is an input by the program user at runtime.
         The perfectScore should be validated such that a perfectScore that is
         0 or negative should let the program user re-enter a valid perfectScore.

         The rawScore is an input by the program user at runtime.
         The rawScore should be validated such that a rawScore that is greater than the
         perfectScore should let the program user re-enter a valid rawScore.
         In addition, a rawScore that is less than 0 should let the program user
         re-enter a valid rawScore.

         The program execution will stop only if the user answers no to the question
         Do you want to compute another grade<Yes/No> ?

 */

/*
1. Construct input as an object of the Scanner class
2. Declare and initialize rawScore and perfectScore
3. Declare and initialize grade
4. Declare and initialize computeAgain to true.
5. while computeAgain = true;
5.3 Compute the grade by using the computeGrade method
5.4. Print the computed grade
5.5. Print a prompt message "Do you want to compute again<Yes/No>?"
5.6. Read the response to the prompt message "Do you want to compute again<Yes/No>?" and assign to computeAgain
5.7. Repeat from  step 5
 */

public class M1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int rawScore;
    int perfectScore;
    int grade;
    boolean compute_again = true;

    while (compute_again) {
      do {
        System.out.println("Enter the perfect score");
        perfectScore = input.nextInt();

        if (perfectScore <= 0) System.out.println(
          "Invalid perfect score it must be greater than 0"
        );
      } while (perfectScore <= 0);

      do {
        System.out.println("Enter raw score");
        rawScore = input.nextInt();
        if (rawScore < 0) System.out.println(
          "Raw score must not be less than 0"
        );

        if (rawScore > perfectScore) System.out.println(
          "Raw score must not be greater than perfect score"
        );
      } while (rawScore < 0 || rawScore > perfectScore);

      grade = (int) ((double) rawScore / (double) perfectScore * 50 + 50);

      System.out.println(
        "raw score is = " +
        rawScore +
        " \nperfectscore = " +
        perfectScore +
        " \nYOUR GRADE IS = " +
        grade +
        ("%")
      );

      System.out.println("\nDo you want to compute again<Y/N>?");
      char answer = input.next().charAt(0);

      if (answer == 'Y' || answer == 'y') {
        compute_again = true;
      } else {
        compute_again = false;
        System.out.println("Thanks for using my grading system");
      }
    }
  }
}
