package Finals.done;

import java.util.Scanner;

public class practice {

  public static void main(String[] args) {}

  public static void balloonSortGrade(int a[], String[] x) {
    int n = a.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      int swap = 0;

      for (int j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          swap = 1;
        }
      }
      if (swap == 1) {
        System.out.println();
        System.out.println("Sorted");
        printTable(a, x);
        break;
      }
    }
  }

  private static void StudentNameGradeInput(
    String[] student,
    int[] grade,
    int[] number
  ) {
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < number.length; i++) {
      System.out.println("enter the name of student " + (i + 1));
      student[i] = input.nextLine();
    }
    for (int j = 0; j < number.length; j++) {
      System.out.println("Enter the grade of student " + (j + 1));
      grade[j] = input.nextInt();
    }
  }

  private static void printTable(int[] grades, String[] students) {
    for (int i = 0; i < grades.length; i++) {
      System.out.println(students[i] + "\t" + "grade : " + grades[i]);
    }
    System.out.println("\n");
  }

  public static void sortGrade() {
    Scanner input = new Scanner(System.in);
    int[] grade;
    int[] number;
    String[] student;

    int n = 0;
    System.out.println("Input the number of students");
    n = input.nextInt();
    number = new int[n];
    grade = new int[n];
    student = new String[n];
    StudentNameGradeInput(student, grade, number);
    balloonSortGrade(grade, student);
  }
}
