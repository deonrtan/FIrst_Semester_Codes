package Prelims.exercises;

import java.util.*;

public class GradeAverage1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int grade = 0;
    int units = 0;
    int totalGrade = 0;
    int totalUnits = 0;
    double average = 0.0;

    System.out.print(
      "Enter the grade of the student for the 1st subject = FIT HW : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 1st subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 2nd subject = CS 111 : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 2nd subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 3rd subject = CS 111L : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 3rd subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 4th subject = CS 112 : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 4th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 5th subject = CS 112L : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 5th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 6th subject = CS 113 : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 6th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 7th subject = GART : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 7th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 8th subject = GSELF : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 8th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 9th subject = GHIST : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 9th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    System.out.print(
      "Enter the grade of the student for the 10th subject = CFE 101 : "
    );
    grade = Integer.parseInt(input.nextLine());
    System.out.print("Enter the number of units for the 10th subject: ");
    units = Integer.parseInt(input.nextLine());

    totalGrade = totalGrade + grade * units;
    totalUnits += units;

    average = totalGrade / totalUnits;
    System.out.println(average);

    if (average >= 85) {
      System.out.println("“Congratulations! You belong to the dean's list.");
    } else if (average < 85) {
      System.out.println(
        "Sorry! You did not make it to the dean's list. Do better next term."
      );
    } else if (average < 70) {
      System.out.println(
        "You failed the course, hope you feel bad about yourself for not studying"
      );
    }
    // ( sum grades * units)/ total units

  } // end of main method
} // end of class
