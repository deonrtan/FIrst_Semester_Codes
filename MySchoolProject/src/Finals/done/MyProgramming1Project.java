package Finals.done;

import java.util.Random;
import java.util.Scanner;

public class MyProgramming1Project {

  // main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int myChoice = 0;
    showIntroduction();
    input.nextLine();
    do {
      showMainMenu();
      myChoice = enterChoice(1, 4);
      switch (myChoice) {
        case 1:
          mathSolver();
          break;
        case 2:
          recordKeeping();
          break;
        case 3:
          miscellaneousProcesses();
          break;
        case 4:
          showEnd();
      } // end switch
    } while (myChoice != 4);
  } // end main method

  public static void CallingCard() {
    String name = "Tan, Deon R.";
    String cp = "09695128980";
    String email = "deonroblestan@gmail.com";
    String address = "Aurora Hill";

    System.out.println("*****************************************************");
    System.out.println("*                 My Calling Card                   *");
    System.out.println("*                                                   *");
    System.out.println("* Programmer       : " + name + "                   *");
    System.out.println("* Cellphone Number : " + cp + "                    *");
    System.out.println("* Email Address    : " + email + "        *");
    System.out.println(
      "* Address          : " + address + "                    *"
    );
    System.out.println("*                                                   *");
    System.out.println("*                                                   *");
    System.out.println("*****************************************************");
    System.exit(0);
  }

  public static void showEnd() {
    System.out.println();
    System.out.println("----------------------------");
    System.out.println("Thank you for using my program.");
    System.out.println("Enjoy the rest of your day.");
    System.out.println("----------------------------");
    System.out.println();
    CallingCard();
    System.exit(0);
  }

  public static void showIntroduction() {
    System.out.println("\n\n");
    System.out.println("---------------------------------------------");
    System.out.println("College of Information and Computing Sciences");
    System.out.println("Saint Louis University");
    System.out.println("Baguio City ");
    System.out.println("---------------------------------------------");
    System.out.println(" Deon Robles Tan ");
    System.out.println(" Computer Science Student");
    System.out.println(" Programmer");
    System.out.println("---------------------------------------------");
    System.out.print("Please press a key to see Main Menu...");
    System.out.println();
  }

  public static void showMainMenu() {
    System.out.println("\nMain Menu ");
    System.out.println("----------------------------");
    System.out.println("1. Math Routines");
    System.out.println("2. Recording Routines");
    System.out.println("3. Miscellaneous Routines");
    System.out.println("4. Exit");
    System.out.println("------------------------------");
  }

  public static void showMenu1() {
    System.out.println("Math Routine Submenu ");
    System.out.println("-----------------------------------------------");
    System.out.println("1. Determine whether an integer is odd or even");
    System.out.println("2. Determine sum of a series");
    System.out.println("3. Determine the factors of a number");
    System.out.println("4. Determine if a number is prime");
    System.out.println("5. Determine the area of a circle");
    System.out.println("6. Determine the area of a square");
    System.out.println("7. Determine the area of a triangle");
    System.out.println("8. Determine the area of a rectangle");
    System.out.println("9. Determine the area of a trapezoid");
    System.out.println("10. Determine the area of a parallelogram");
    System.out.println("11. Determine if an integer is a perfect number");
    System.out.println("12. Generate a multiplication table");
    System.out.println("13. Determine the roots of a quadratic equation");
    System.out.println("14. Generate a Fibonacci Sequence");
    System.out.println("15. Generate a Pascal's Triangle");
    System.out.println("16. Back to Main Menu");
    System.out.println("------------------------------------------------");
  }

  public static void showMenu2() {
    System.out.println("Recording Routine Submenu ");
    System.out.println("-----------------------------------------------");
    System.out.println("1. Accept and sort list of students");
    System.out.println("2. Accept and sort list of Salesmen");
    System.out.println(
      "3. Accept pairs of names and grades and sort list according to name"
    );
    System.out.println(
      "4. Accept pairs of names and grades and sort list according to " +
      "grade"
    );
    System.out.println("5. Back to Main Menu");
    System.out.println("------------------------------------------------");
  }

  public static void showMenu3() {
    System.out.println("Miscellaneous Routine Submenu ");
    System.out.println("-----------------------------------------------");
    System.out.println("1. Number Guessing Game");
    System.out.println("2. Covid19 Self-Assessment Procedure ");
    System.out.println("3. Bills distribution of an amount of Money");
    System.out.println("4. Interest of Money Invested ");
    System.out.println("5. Income Tax Computation");
    System.out.println("6. Insect Population Growth Rate");
    System.out.println("7. Water Bill computaion.");
    System.out.println("8. Electric Bill computation.");
    System.out.println("9. Mobile Phone Load Balance Computation.");
    System.out.println("10. Back to Main Menu");
    System.out.println("------------------------------------------------");
  }

  public static int enterChoice(int min, int max) {
    Scanner keyboard = new Scanner(System.in);
    int choice = 0;
    do {
      System.out.print("Input the number corresponding to your choice: ");
      choice = keyboard.nextInt();
      if (choice < min || choice > max) System.out.println(
        "Invalid choice. Please ensure that you enter a number from " +
        min +
        " to " +
        max +
        "."
      );
    } while (choice < min || choice > max);
    return (choice);
  }

  public static int inputPositive() {
    Scanner keyboard = new Scanner(System.in);
    int value;

    System.out.println();

    do {
      value = Integer.parseInt(keyboard.nextLine());

      if (value <= 0) {
        System.out.println("Invalid input. Must be a positive integer");
        System.out.print("Please enter a valid value: ");
      }
    } while (value <= 0);

    return value;
  } // end of inputPositive method

  //-----------------------END OF CHOICE-----------------------\\

  public static void mathSolver() {
    Scanner kbd = new Scanner(System.in);
    int choice = 0;
    do {
      showMenu1();
      choice = enterChoice(1, 16);
      switch (choice) {
        case 1:
          int y;
          System.out.println(
            "This choice determines if a number is odd or even"
          );
          System.out.print("Enter an integer :");

          y = kbd.nextInt();
          System.out.println(detOddEven(y));

          System.out.println();
          System.out.print("press enter to continue...");

          kbd.nextLine();
          kbd.nextLine();
          break;
        case 2:
          int z;

          System.out.print(
            "Enter an integer you want to know the sum of series of :"
          );

          z = kbd.nextInt();
          System.out.println("The sum of the series is " + getSumOfSeries(z));
          System.out.println();

          System.out.print("press enter to continue...");

          kbd.nextLine();
          kbd.nextLine();
          break;
        case 3:
          int factors;
          System.out.println("Enter a number you want to factor out");
          factors = kbd.nextInt();
          factorsOfNumber(factors);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();

          break;
        case 4:
          System.out.println(
            "Enter a number you want to determine if it is a prime or not"
          );
          int prime = kbd.nextInt();
          primeDeterminer(prime);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 5:
          System.out.println("Finding the area of the circle");
          System.out.println("----------------------------");
          System.out.println("Enter the radius of the circle");
          int areaOfCircle = kbd.nextInt();
          System.out.println(
            "Area of the circle is" + areaOfCircle(areaOfCircle)
          );

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 6:
          int side;
          System.out.println("Finding the area of the square");
          System.out.println("----------------------------");
          System.out.println("Enter the side of the Square");
          side = kbd.nextInt();
          System.out.print("The area of the square is: ");
          areaOfSquare(side);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 7:
          int base, height;
          System.out.println("Finding the area of the triangle");
          System.out.println("----------------------------");
          System.out.println("Enter the base of the triangle ");
          base = kbd.nextInt();
          System.out.println("Enter the height of the triangle ");
          height = kbd.nextInt();

          System.out.print("The area of the triangle is: ");
          areaOfTriangle(base, height);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 8:
          int length, width;
          System.out.println("Finding the area of the rectangle");
          System.out.println("----------------------------");
          System.out.println("Enter the length of the Rectangle ");
          length = kbd.nextInt();
          System.out.println("Enter the width of the Rectangle ");
          width = kbd.nextInt();

          System.out.print("The area of the Rectangle is: ");
          areaOfRectangle(length, width);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 9:
          int longBase, shortBase, altitude;
          System.out.println("Finding the area of the trapezoid");
          System.out.println("----------------------------");
          System.out.println("Enter the long base of the trapezoid");
          longBase = kbd.nextInt();
          System.out.println("Enter the short base of the trapezoid");
          shortBase = kbd.nextInt();
          System.out.println("Enter the altitude of the trapezoid");
          altitude = kbd.nextInt();

          System.out.print("The area of the Trapezoid is: ");
          areaOfTrapezoid(longBase, shortBase, altitude);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();

          break;
        case 10:
          int base2, height2;
          System.out.println("Finding the area of the parallelogram");
          System.out.println("----------------------------");
          System.out.println("Enter the base of the parallelogram");
          base2 = kbd.nextInt();
          System.out.println("Enter the height base of the parallelogram");
          height2 = kbd.nextInt();

          System.out.print("The area of the Parallelogram is: ");
          areaOfParallelogram(base2, height2);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 11:
          System.out.println(
            "Determining if a number is a perfect number or not"
          );
          System.out.println("----------------------------");
          int n = 0;
          n = readNumber(32000);
          if (isPerfect(n)) { // ITEM 7 invokes isPerfect method and pass n to it
            System.out.println(n + " is a perfect number.");
          } else {
            System.out.println(n + " is not a perfect number.");
          }
          // end of main method
          System.out.print("press enter to continue...");
          kbd.nextLine();
          break;
        case 12:
          System.out.println("Creating a multiplication table");
          System.out.println("----------------------------");
          System.out.println("Enter the range of the number");
          int tableLength = kbd.nextInt();
          System.out.println("MULTIPLICATION TABLE");
          multiplicationTable(tableLength);
          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 13:
          Scanner input = new Scanner(System.in);
          int a, b, c;
          System.out.println("Determining the roots of a quadtratic equation");
          System.out.println("----------------------------");
          System.out.println("Enter the coefficient of x^2 (a): ");
          a = input.nextInt();
          System.out.println("Enter the coefficient of x (b): ");
          b = input.nextInt();
          System.out.println("Enter the constant (c)");
          c = input.nextInt();
          quadraticEquation(a, b, c);

          System.out.print("press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 14:
          int t;
          System.out.println("Generating a fibonacci sequence");
          System.out.println("----------------------------");
          System.out.print("\nHow many terms do you want? ");
          t = kbd.nextInt();
          generateFibonacciSequence(t);

          System.out.print("Press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 15:
          System.out.println("Generating a Pascal's Triangle");
          System.out.println("----------------------------");
          System.out.println(
            "The number of the elements of your pascal Triangle"
          );
          int pascal = kbd.nextInt();
          pascalTriange(pascal);

          System.out.print("Press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 16:
          showMainMenu();
      } // end of cases
    } while (choice != 16);
  } // end of mathSolver method

  //------------------------------ MATH ROUTINES FUNCTION ------------------------------\\
  //1. determine whether an integer is an odd or even \\
  public static String detOddEven(int number) {
    if (number % 2 != 0) return (" The number is odd "); else return (
      " The number is even "
    );
  }

  //--------2. determine sum of the series--------\\
  public static double getSumOfSeries(int n) {
    double sum = 0;
    if (n > 1 && n % 2 == 0) {
      for (int ctr = n; ctr > 1; ctr -= 2) sum += (1.0 / ctr);
    }
    return (sum);
  } // end of method

  //--------3. Determine the factors of a number--------\\
  public static void factorsOfNumber(int n) {
    System.out.println("Factors of " + n + " Are:");
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        System.out.println(i + " ");
      }
    }
    System.out.println();
  }

  //--------4. Determine if a number is prime--------\\
  //prime number has only two factors 1 and itself
  public static void primeDeterminer(int n) {
    boolean determiner = false;
    for (int i = 2; i <= n / 2; ++i) {
      // condition for nonprime number
      if (n % i == 0) {
        determiner = true;
        break;
      }
    }

    if (!determiner) System.out.println(
      n + " is a prime number."
    ); else System.out.println(n + " is not a prime number.");
  }

  //--------5. Determine the area of a circle--------\\
  public static double areaOfCircle(int x) {
    //formula for the area of circle is
    // Area = (pi)(radius)^2
    double pi = 3.14;
    double sum = pi * (x * x);
    return sum;
  }

  //--------6. Determine the area of a square--------\\
  public static int areaOfSquare(int x) {
    // formula for the area of the square is
    // Area = side^2
    int sum = x * x;
    return sum;
  }

  //--------7. Determine the area of a Triangle--------\\
  public static double areaOfTriangle(int base, int height) {
    // formula for the area of the Triangle is
    // Area = 1/2 (base) (height)
    double sum = 0.5 * (base * height);
    return sum;
  }

  //--------8. Determine the area of a Rectangle--------\\
  public static int areaOfRectangle(int length, int width) {
    // formula for the area of the Square is
    // Area = (length) (width)
    int sum = length * width;
    return sum;
  }

  //--------9. Determine the area of a Trapezoid--------\\
  public static double areaOfTrapezoid(
    int longBase,
    int shortBase,
    int altitude
  ) {
    // formula for the area of the trapezoid is
    // Area = ((long base + shortbase) / 2) * altitude
    double sum = ((longBase + shortBase) / 2) * altitude;
    return sum;
  }

  //--------10. Determine the area of a Parallelogram--------\\
  public static int areaOfParallelogram(int base, int height) {
    // formula for the area of the Square is
    // Area = (base) (height)
    int sum = base * height;
    return sum;
  }

  //--------11. Determine if an integer is a perfect number--------\\\
  // method that returns true if a number f is a factor of a number n
  public static boolean isFactor(int f, int n) {
    if (n % f == 0) return true; else return false; // n divided by f yields a 0 remainder
  }

  // method that returns the sum of the factors that are less than n of an integer
  // n
  public static int sumFactors(int n) {
    int sum = 0; // initialize sum of factors to 0
    for (int x = 1; x < n; x++) {
      if (isFactor(x, n)) sum = sum + x; // Invoke the isFactor method // ITEM 2
    }
    return sum;
  }

  // method that returns true if an integer n is a perfect number.
  public static boolean isPerfect(int n) {
    if (sumFactors(n) == n) return true; // invoke sumFactors method // ITEM 3
    else return false;
  }

  // method that reads and returns an integer in the range 1 to a specified limit

  public static int readNumber(int limit) {
    Scanner keyboard = new Scanner(System.in);
    int n;
    do {
      System.out.print("Input an integer between 1 and " + limit + " : ");
      n = keyboard.nextInt();
      if (n < 1 || n >= limit) {
        System.out.println(
          "You did not enter a number between 1 and " + limit + "."
        );
      }
    } while (n < 1 || n >= limit);
    return n;
  }

  // the main method reads and evaluate if a number is perfect
  //--------12. Generate a multiplication table--------\\\
  public static void multiplicationTable(int tableSize) {
    System.out.format("      ");
    for (int i = 1; i <= tableSize; i++) {
      System.out.format("%4d", i);
    }
    System.out.println();
    for (int i = 1; i <= tableSize; i++) {
      System.out.print("-----");
    }
    System.out.println();
    for (int i = 1; i <= tableSize; i++) {
      System.out.format("%4d |", i);
      for (int j = 1; j <= tableSize; j++) {
        System.out.format("%4d", i * j);
      }
      System.out.println();
    }
  }

  //--------13. Determine the roots of a quadratic equation--------\\\
  public static void quadraticEquation(int a, int b, int c) {
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

  //--------14. Generate a Fibonacci Sequence--------\\\
  public static void generateFibonacciSequence(int nTerms) {
    int first = 1, second = 1;
    int temp;
    int count = nTerms;
    System.out.print("Terms: ");
    if (nTerms == 1) System.out.println(first);
    if (nTerms == 2) System.out.println(first + " , " + second);
    if (nTerms > 2) {
      System.out.print(first + " , " + second);
      count = count - 2; // remaining terms to print
      while (count > 0) {
        temp = first;
        first = second;
        second = temp + second;
        System.out.print(" , " + second);
        count--;
      } // end of while
      System.out.println();
    } // end of if nTerms > 2
  } // end of generateFibonacciSequence method

  //--------15. Generate a Pascal's Triangle--------\\\
  public static void pascalTriange(int n) {
    for (int line = 1; line <= n; line++) {
      for (int j = 0; j <= n - line; j++) {
        // for left spacing
        System.out.print(" ");
      }

      // used to represent C(line, i)
      int C = 1;
      for (int i = 1; i <= line; i++) {
        // The first value in a line is always 1
        System.out.print(C + " ");
        C = C * (line - i) / i;
      }
      System.out.println();
    }
  }

  //------------------------------ END OF MATH SUBMENU ------------------------------\\
  public static void recordKeeping() {
    Scanner kbd = new Scanner(System.in);
    int choice = 0;
    do {
      showMenu2();
      choice = enterChoice(1, 5);
      switch (choice) {
        case 1:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Accept and sort list of students");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
        case 2:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Accept and sort list of salesman");
          System.out.println("-----------------------------------------------");
          acceptAndSortNamesSalesMan();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
        case 3:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println(
            "To Pair Names and Grades, and Sort According to Name"
          );
          System.out.println("-----------------------------------------------");
          sortNames();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
        case 4:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println(
            "To Pair Names and Grades, and Sort According to Name"
          );
          System.out.println("-----------------------------------------------");
          sortGrade();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
      } // end of cases
    } while (choice != 5);
  } // end of recordKeeping method

  //-----------Displays the elements of an array-----------\\
  public static void showElements(String[] array) {
    for (int x = 0; x < array.length; x++) {
      System.out.println("Student " + (x + 1) + ": " + array[x]);
    }
    System.out.println();
  }

  //--------PRINTING THE TABLE--------\\
  private static void printTable(int[] grades, String[] students) {
    for (int i = 0; i < grades.length; i++) {
      System.out.println(students[i] + "\t" + "grade : " + grades[i]);
    }
    System.out.println("\n");
  }

  //--------GETTING INPUT FROM THE USER ABOUT THEIR NAME AND GRADES--------\\
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

  //--------1. Accept and sort list of students--------\\
  public static void acceptAndSortNames() {
    Scanner keyboard = new Scanner(System.in);
    String[] names;

    int n = 0;
    System.out.print("How many names will be sorted? ");
    n = Integer.parseInt(keyboard.nextLine());
    names = new String[n];
    // Populate array names
    for (int z = 0; z < names.length; z++) {
      System.out.print("Enter name of student " + (z + 1) + ": ");
      names[z] = keyboard.nextLine();
    }
    // Sort the names array
    // Show elements of names array
    System.out.println("The students are: ");
    showElements(names);
  }

  //--------2. Accept and sort list of Salesmen--------\\
  public static void acceptAndSortNamesSalesMan() {
    Scanner keyboard = new Scanner(System.in);
    String[] names;

    int n = 0;
    System.out.print("How many names will be sorted? ");
    n = Integer.parseInt(keyboard.nextLine());
    names = new String[n];
    // Populate array names
    for (int z = 0; z < names.length; z++) {
      System.out.print("Enter name of salesman " + (z + 1) + ": ");
      names[z] = keyboard.nextLine();
    }
    // Sort the names array
    // Show elements of names array
    System.out.println("The salesman are: ");
    showElements(names);
  }

  //--------3. Accept pairs of names and grades and sort list according to name--------\\
  public static void sortNames() {
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
    bubbleSortName(student, grade);
  }

  public static void bubbleSortName(String[] x, int[] y) {
    int n = y.length;
    int swap = 0;

    // Sorting strings using bubble sort
    for (int j = 0; j < n - 1; j++) {
      for (int i = j + 1; i < n; i++) {
        if (x[j].compareTo(x[i]) > 0) {
          swapName(i, j, x);
          swap = 1;
        }
      }
      if (swap == 1) {
        System.out.println();
        System.out.println("Sorted");
        printTable(y, x);
        break;
      }
    }
  }

  public static void swapName(int i, int j, String[] array) {
    String temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  //--------4. Accept pairs of names and grades and sort list according to " +"grade"--------\\

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
    bubbleSortGrade(grade, student);
  }

  //--------SORTING THE GRADE--------\\
  public static void bubbleSortGrade(int[] a, String[] x) {
    int n = a.length;
    int k;
    for (int i = n; i >= 0; i--) {
      int swap = 0;

      for (int j = 0; j < n - 1; j++) {
        k = j + 1;
        if (a[j] > a[k]) {
          swapNumbers(j, k, a);
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

  public static void swapNumbers(int i, int j, int[] array) {
    int temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  //--------Miscellaneous Menu--------\\
  public static void miscellaneousProcesses() {
    Scanner keyboard = new Scanner(System.in);
    int choice = 0;
    do {
      showMenu3();
      choice = enterChoice(1, 10);
      switch (choice) {
        case 1:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Number Guessing Game");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          higherOrLower();
          System.out.println();
          System.out.print("press enter to continue...");
          keyboard.nextLine();
          break;
        case 2:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Covid19 Self-Assesment Procedure");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          covid19();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 3:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println(
            "Welcome to Bills distribution of an amount of money"
          );
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          atmMachine();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 4:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Interest of Money Invested");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          moneyInterest();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 5:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Income Tax Computation");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          incomeTaxComputation();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 6:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Inspect Population Growth Rate");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          insectPopulationGrowthRate();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 7:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Water Bill Computation");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          waterBillComputation();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 8:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Electric Bill Computation");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          electricBillComputation();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 9:
          System.out.println();
          System.out.println("-----------------------------------------------");
          System.out.println("Welcome to Mobile Phone Load Computation");
          System.out.println("-----------------------------------------------");
          acceptAndSortNames();
          char operation;

          System.out.println("Enter your name");
          String user = keyboard.nextLine();
          System.out.print("Enter your prepaid load balance: ");
          int prepaidLoad = inputPositive();

          do {
            System.out.print("Enter 'c' if you called or 't' if you texted: ");
            operation = keyboard.next().charAt(0);

            if (
              operation != 'c' &&
              operation != 'C' &&
              operation != 't' &&
              operation != 'T'
            ) {
              System.out.println(
                "Invalid input! Not included in the two options."
              );
              System.out.println();
            }
          } while (
            operation != 'c' &&
            operation != 'C' &&
            operation != 't' &&
            operation != 'T'
          );

          loadBalanceCalculator(user, prepaidLoad, operation);

          System.out.println();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          keyboard.nextLine();
          break;
        case 10:
          //I love you valerie
          showMainMenu();
      } // end of cases
    } while (choice != 10);
  } // end of miscellaneousProcesses method

  //--------------- Miscellenous Methods ---------------\\
  //--------1. Number Guessing Game --------\\
  public static void higherOrLower() {
    Scanner keyboard = new Scanner(System.in);
    Random rndNoGen = new Random(); // Random class is a facility for
    // generating random numbers
    int secretNo = rndNoGen.nextInt(100) + 1; // generate a random number
    // that is in the range from 1 to 100.
    System.out.println("I have an integer from 1 to 100.");
    System.out.println("You have 10 chances to guess it.");
    int guessNo = 0;
    int guess;
    boolean gotIt = false;
    do {
      System.out.print("\nGuess #" + (guessNo + 1) + ": ");
      guess = keyboard.nextInt();
      if (guess == secretNo) {
        gotIt = true;
        break; // terminate the loop immediately
      } else {
        if (guessNo == 10) {
          break; // terminate the loop immediately
        } else {
          if (guess > secretNo) {
            System.out.println("Try something lower.");
          } else {
            System.out.println("Try something higher.");
          }

          guessNo++;
        }
      }
    } while (guessNo < 10);
    if (gotIt) {
      System.out.println("\nCongratulations!!!");
      System.out.println("Got it in " + guessNo + " trial(s)!");
    } else {
      System.out.println("\nSorry. No more guesses left.");
      System.out.println("The number is " + secretNo + ".");
      System.out.println("Better luck next time.");
    }
    System.out.println("\nThanks for playing!!!");
    System.out.println("Have a nice day :)!");
  } // end of higherOrLower method

  //--------2. Covid19 Self-Assessment Procedure--------\\
  public static void covid19() {
    Scanner input = new Scanner(System.in);
    String firstName, lastName, address, contactNumber;
    int age;
    int vaccinationCardNo, vaccinationStatus;
    System.out.println("Enter your First Name");
    firstName = input.nextLine();
    System.out.println("Enter your Last Name");
    lastName = input.nextLine();

    do {
      System.out.println("Enter your age");
      age = input.nextInt();
      if (age < 5) {
        System.out.println("You should be at least 5 years old to register.");
      }
    } while (age < 5);

    System.out.print("Enter your Contact Number: ");
    contactNumber = input.next();
    System.out.print("Enter your Local Address: ");
    address = input.next();

    System.out.println(
      "Your Vaccination Status | 1(Full Vaccinated) | 2(Partially Vaccinated) | 3(Not Vaccinated)"
    );
    vaccinationStatus = input.nextInt();

    switch (vaccinationStatus) {
      case 1:
        System.out.println("Fully Vaccinated");
        break;
      case 2:
        System.out.println("Partially Vaccinated");
        break;
      case 3:
        System.out.println("Not Vaccinated");
        System.out.println(
          "Sorry you cant pass the premises, only those who are vaccinated could enter"
        );
        System.exit(0);
        break;
      default:
        System.out.println("System Error");
    }

    System.out.print("Vaccination Card number: ");
    vaccinationCardNo = input.nextInt();

    System.out.println("Are you experiencing any of the following | <Y or N>|");
    System.out.println(
      "severe difficulty breathing (e.g., struggling for each breath, speaking in single words)"
    );
    System.out.println("severe chest pain");
    System.out.println("having a very hard time waking up");
    System.out.println("feeling confused");
    System.out.println("lost consciousness");
    char answer = input.next().charAt(0);
    if (answer == 'Y' || answer == 'y') {
      System.out.println(
        "Please call 911 or go directly to your nearest emergency department."
      );
    } else {
      System.out.println("You may pass");
    }
  }

  //--------3. Bills distribution of an amount of Money--------\\
  public static void atmMachine() {
    Scanner input = new Scanner(System.in);
    int one;
    int five;
    int one_thousand;
    int get;
    int total;

    System.out.println("Enter amount to be withdrawn, whole numbers only:");
    get = input.nextInt();

    if (get < 1000) {
      one = ((get % 1000) % 500) / 100;
      five = (get % 1000) / 500;

      if (one >= 5) { // if the variable one is greater than 5 in the second digit use the if statement
        one /= 5;
        total = one + five; // total number of amount withdrawn
        System.out.println("");
        System.out.println("Bills Counter: ");
        System.out.println(
          "100 pesos :" +
          "  Quantity Dispensed : " +
          one +
          " Bills, " +
          "Amount: " +
          one *
          100 +
          " Pesos"
        );
        System.out.println(
          "500 pesos : " +
          " Quantity Dispensed : " +
          five +
          " Bills, " +
          "Amount: " +
          five *
          500 +
          " Pesos"
        );
        System.out.println("");
        System.out.println("Total No. Of bills: " + total);
        System.out.println("");
        System.out.println("Total Amount: " + get + " Pesos");
      } else {
        total = one + five;
        System.out.println("");
        System.out.println("Bills Counter: ");
        System.out.println(
          "100 pesos :" +
          "  Quantity Dispensed : " +
          one +
          " Bills, " +
          "Amount: " +
          one *
          100 +
          " Pesos"
        );
        System.out.println(
          "500 pesos : " +
          " Quantity Dispensed : " +
          five +
          " Bills, " +
          "Amount: " +
          five *
          500 +
          " Pesos"
        );
        System.out.println("");
        System.out.println("Total No. Of bills: " + total);
        System.out.println("");
        System.out.println("Total Amount: " + get + " Pesos");
      }
      //------------------------------- using if and else for the statements -------------------------------\\
    } else if (get >= 1000) {
      // using "%" to get the third digit of a thousand value
      one = ((get % 1000) % 500) / 100;
      five = (get % 1000) / 500;
      one_thousand = get / 1000;

      //------------------------------- printing the output of the calculated variables -------------------------------\\
      if (one >= 5) { // if the variable one is greater than 5 in the second digit use the if statement
        one /= 5;
        total = one + five + one_thousand; // total number of amount withdrawn
        System.out.println("");
        System.out.println("Bills Counter: ");
        System.out.println(
          "100 pesos :" +
          "  Quantity Dispensed : " +
          one +
          " Bills, " +
          "Amount: " +
          one *
          100 +
          " Pesos"
        );
        System.out.println(
          "500 pesos : " +
          " Quantity Dispensed : " +
          five +
          " Bills, " +
          "Amount: " +
          five *
          500 +
          " Pesos"
        );
        System.out.println(
          "1000 pesos : " +
          "Quantity Dispensed : " +
          one_thousand +
          " Bills, " +
          "Amount: " +
          one_thousand *
          1000 +
          " Pesos"
        );
        System.out.println("");
        System.out.println("Total No. Of bills: " + total);
        System.out.println("");
        System.out.println("Total Amount: " + get + " Pesos");
      } else {
        total = one + five + one_thousand; // total number of amount withdrawn
        System.out.println("");
        System.out.println("Bills Counter: ");
        System.out.println(
          "100 pesos :" +
          "  Quantity Dispensed : " +
          one +
          " Bills, " +
          "Amount: " +
          one *
          100 +
          " Pesos"
        );
        System.out.println(
          "500 pesos : " +
          " Quantity Dispensed : " +
          five +
          " Bills, " +
          "Amount: " +
          five *
          500 +
          " Pesos"
        );
        System.out.println(
          "1000 pesos : " +
          "Quantity Dispensed : " +
          one_thousand +
          " Bills, " +
          "Amount: " +
          one_thousand *
          1000 +
          " Pesos"
        );
        System.out.println("");
        System.out.println("Total No. Of bills: " + total);
        System.out.println("");
        System.out.println("Total Amount: " + get + " Pesos");
      }
    } else if (get >= 10000) {
      System.out.println(
        "The max amount of the bank is 9999, Sorry Withdraw a less amount"
      );
    } else {
      System.out.println(
        "Withdraw a number greater than 100 or less than 10000"
      );
    }
  }

  //--------4. Interest of Money Invested--------\\
  public static void moneyInterest() {
    Scanner input = new Scanner(System.in);

    float annualRate;
    float quarterlyRate;
    double principal;
    double interest;
    double finalAmount;
    byte quarter;
    int year;

    annualRate = 0.05F; // set annual interest to 5%

    int y = 1;

    System.out.print("Enter the year: ");
    year = input.nextInt();

    System.out.print("Enter the initial principal: ");
    principal = input.nextDouble();

    System.out.printf("%s%.2f%n", "Principal = ", principal);
    System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
    System.out.printf(
      "%6s%8s%16s%30s%n",
      "Year",
      "Quarter",
      "Interest Earned",
      "Amount at end of quarter"
    );

    quarterlyRate = (float) (principal + annualRate) / 4;
    quarter = 1;
    interest = (double) (principal * annualRate) / 4;
    finalAmount = principal + interest;
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );

    principal = finalAmount;
    quarter = 2;
    interest = (double) (principal * annualRate) / 4;
    finalAmount = principal + interest;
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );

    principal = finalAmount;
    quarter = 3; // item 8
    interest = (double) (principal * annualRate) / 4;
    finalAmount = principal + interest;
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );

    principal = finalAmount;
    quarter = 4;
    interest = (double) (principal * annualRate) / 4;
    finalAmount = principal + interest;
    System.out.printf(
      "%6s%8d%16.2f%30.2f%n",
      year,
      quarter,
      interest,
      finalAmount
    );
    System.exit(0);
  }

  //--------5. Income Tax Computation--------\\
  public static void incomeTaxComputation() {
    double taxableIncome;
    double taxDue;
    // Introduce the program by invoking the showIntroduction method
    showIntroductionTax();

    // Read the taxable income from the keyboard by invoking the readTaxableIncome method
    taxableIncome = readTaxableIncome();
    // Compute the tax due by invoking the computeTaxDue method
    taxDue = computeTaxDue(determineBracket(taxableIncome), taxableIncome);
    // Show the taxable income by invoking the showResults method
    showResults(taxableIncome, taxDue);
    System.exit(0);
  } // end of main method

  //shows statements that introduce the application on the output screen
  public static void showIntroductionTax() {
    System.out.println("Hypothetical Tax Computation Program");
    System.out.println("------------------------------------");
    System.out.println(
      "This program is for the computation of the tax due from a taxpayer " +
      "with a known taxable income."
    );
    System.out.println();
  } // end of showIntroduction methods

  public static double readTaxableIncome() {
    Scanner input = new Scanner(System.in);
    double income = 0.0;

    do {
      System.out.print("Enter the taxable income: ");
      income = Double.parseDouble(input.nextLine());
    } while (income < 0);
    return income;
  } // end of readTaxableIncome method

  public static int determineBracket(double taxableIncome) { // ITEM 4
    int bracket = 0;
    if (taxableIncome <= 25000.00) bracket = 1; else if (
      taxableIncome <= 125000.00
    ) bracket = 2; else if (taxableIncome <= 525000.00) bracket =
      3; else bracket = 4;
    return bracket;
  } // end of determineBracket method

  public static double computeTaxDue(int bracket, double taxableIncome) { // ITEM 5
    double taxDue = 0.0;
    switch (bracket) {
      case 1:
        taxDue = 4000.00;
        break;
      case 2:
        taxDue = 4000.00 + (taxableIncome - 25000.00) * 0.08;
        break;
      case 3:
        taxDue = 12000.00 + (taxableIncome - 125000.00) * 0.10;
        break;
      case 4:
        taxDue = 52000.00 + (taxableIncome - 525000.00) * 0.12;
        break;
      default:
        taxDue = 0.00;
    }
    return taxDue;
  } // end of computeTaxDue method

  //displays a given taxable income and the corresponding tax amount on the output screen
  public static void showResults(double taxableIncome, double taxDue) { // ITEM 7
    System.out.println();
    System.out.printf("%-20s%15.2f%n", "Taxable Income: ", taxableIncome);
    System.out.printf("%-20s%15.2f%n", "Tax Due = ", taxDue);
  } // end of showResults method

  //--------6. Insect Population Growth Rate --------\\
  public static void insectPopulationGrowthRate() {
    Scanner keyboard = new Scanner(System.in);
    int fSize, iSize;
    double rateOfGrowth;
    System.out.println("Kindly enter the following:");
    System.out.print(" Initial population ... ");
    iSize = keyboard.nextInt();
    System.out.print(" Current population..... ");
    fSize = keyboard.nextInt();
    rateOfGrowth = (fSize - iSize) * 100.0 / iSize;
    System.out.print("\nThe rate of growth is " + rateOfGrowth + "%");
    System.out.println(
      " because (" +
      fSize +
      " - " +
      iSize +
      ") * 100 / " +
      iSize +
      " is " +
      rateOfGrowth +
      "%"
    );
  } // end of insectPopulationGrowthRate method

  //--------7. Water Bill computaion. --------\\
  public static void waterBillComputation() {
    int presentReading = 0, previousReading = 0;
    Scanner kbd = new Scanner(System.in);
    String consumer = ""; // to hold name of consumer
    char cType = 'x'; // to hold type of consumer
    int nCMUsed; // to hold number of cubic meters ofwater used
    int minCMResidential = 12; // to hold cut-off for minimum Bill forresidential consumers
    double minBillResidential = 180.00; // minimum bill for <= 12 Cubic Meters used
    float rateResidential = 30.00F; // cost of 1 Cubic Meter above the min.consumption
    int minCMCommercial =
      30;/* to hold cut-off for minimum Bill for commercial consumers */
    double minBillCommercial = 600.00; // minimum bill for <= 20Cubic Meters used
    float rateCommercial =
      50.00F;/* cost of 1 Cubic Meter above the min.consumption for commercial consumers */
    double amountDue = 0.0; // to hold the amount due

    System.out.print("Enter the consumer's name: ");
    consumer = kbd.nextLine();
    do {
      System.out.print("Enter the meter reading last month: ");
      previousReading = Integer.parseInt(kbd.nextLine());
      if (previousReading < 0) {
        System.out.println("The meter reading cannot me negative.");
      }
    } while (previousReading < 0);
    do {
      System.out.print("Enter the meter reading this month: ");
      presentReading = kbd.nextInt();
      if (presentReading < previousReading) {
        System.out.println(
          "The present meter reading cannot be less than the previous water meter readings"
        );
      }
    } while ((presentReading < previousReading));

    nCMUsed = presentReading - previousReading;

    System.out.print(
      "Enter the type of consumer you are: |c for commercial| |r for residential|: "
    );
    cType = kbd.next().charAt(0);
    switch (cType) {
      case 'c':
      case 'C':
        if (nCMUsed <= minCMCommercial) {
          amountDue = minBillCommercial;
        } else if (nCMUsed > minCMCommercial) {
          amountDue =
            minBillCommercial + (nCMUsed - minCMCommercial) * rateCommercial;
        }
        break;
      case 'r':
      case 'R':
        if (nCMUsed <= minCMResidential) {
          amountDue = minBillResidential;
        } else if (nCMUsed > minCMResidential) {
          amountDue =
            minBillResidential + (nCMUsed - minCMResidential) * rateResidential;
        }
        break;
    }
    System.out.println("Bill Statement");
    System.out.println();
    System.out.println("Consumers Name : " + consumer);
    System.out.println("Readings : " + nCMUsed);
    System.out.println("Consumption : " + cType);
    System.out.println("Amount due : " + amountDue + " Pesos");
  }

  //--------8. Electric Bill computation. --------\\
  public static void electricBillComputation() {
    System.out.println("Meralco's Billing Rate (December)");
    System.out.println("---------------------------------");
    int presentReading = 0, previousReading = 0;
    Scanner kbd = new Scanner(System.in);
    String consumer = ""; // to hold name of consumer's Name
    int kwhUsed; // to hold number of kWh used
    float rateResidential = 9.94F; // cost of 1 kwH
    float amountDue = 0.00F; // to hold the amount due

    System.out.print("Enter the consumer's name: ");
    consumer = kbd.nextLine();
    do {
      System.out.print("Enter the meter reading last month: ");
      previousReading = Integer.parseInt(kbd.nextLine());
      if (previousReading < 0) {
        System.out.println("The meter reading cannot me negative.");
      }
    } while (previousReading < 0);
    do {
      System.out.print("Enter the meter reading this month: ");
      presentReading = kbd.nextInt();
      if (presentReading < previousReading) {
        System.out.println(
          "The present meter reading cannot be less than the previous kWh readings"
        );
      }
    } while ((presentReading < previousReading));

    kwhUsed = presentReading - previousReading;
    amountDue = kwhUsed * rateResidential;

    System.out.println("Bill Statement");
    System.out.println();
    System.out.println("Consumers Name \t: " + consumer);
    System.out.println("Readings \t: " + kwhUsed);
    System.out.println("Amount due \t: " + amountDue + " Pesos");
  }

  //--------9. Mobile Phone Load Balance Computation. --------\\
  public static void loadBalanceCalculator(
    String user,
    double balance,
    char operationType
  ) {
    int callDuration;
    int sentMessages;
    float ratePerMinute = 3.00F;
    float ratePerSent = 10.00F;
    double amountDue = 0.0;
    double remainingBalance;

    String classification = "";

    //for classification
    if (operationType == 'c' || operationType == 'C') {
      classification = "Calls";
    } else if (operationType == 't' || operationType == 'T') {
      classification = "Texts";
    }

    switch (operationType) {
      case 'c':
      case 'C':
        System.out.println("How long did your call lasted?");
        System.out.print("Enter the Number of Minutes used for calls: ");
        callDuration = inputPositive();
        amountDue = callDuration * ratePerMinute;

        break;
      case 't':
      case 'T':
        System.out.println("How many messages did you send?");
        System.out.print("Enter the Number of Messages sent: ");
        sentMessages = inputPositive();
        amountDue = sentMessages * ratePerSent;

        break;
    }
    remainingBalance = balance - amountDue;
  }
}
