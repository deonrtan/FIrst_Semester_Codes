package Finals.Activities;

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

  public static void showEnd() {
    System.out.println("---------------------------------------------");
    System.out.println("Thank you for using my program.");
    System.out.println("Enjoy the rest of your day.");
    System.out.println("---------------------------------------------");
  }

  public static void showIntroduction() {
    System.out.println("\n\n\n");
    System.out.println("---------------------------------------------");
    System.out.println("College of Information and Computing Sciences");
    System.out.println("Saint Louis University");
    System.out.println("Baguio City ");
    System.out.println("---------------------------------------------");
    System.out.println(" Deon Robles Tan ");
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

  //-----------------------END OF CHOICE-----------------------\\

  public static void mathSolver() {
    Scanner kbd = new Scanner(System.in);
    int choice = 0;
    boolean invoke = true;
    do {
      showMenu1();
      choice = enterChoice(1, 16);
      switch (choice) {
        case 1:
          int y;

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

          System.out.print("Enter an integer :");

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
          System.out.print("\nHow many terms do you want? ");
          t = kbd.nextInt();
          generateFibonacciSequence(t);

          System.out.print("Press enter to continue...");
          kbd.nextLine();
          kbd.nextLine();
          break;
        case 15:
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
          acceptAndSortNames();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
        case 2:
          acceptAndSortNamesSalesMan();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
        case 3:
          sortNames();
          System.out.print("Press enter to continue...");
          kbd.nextLine();
          break;
        case 4:
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
    balloonSortName(student, grade);
  }

  public static void balloonSortName(String[] x, int[] y) {
    String temp;
    int swap = 0;
    int n = x.length;

    for (int j = 0; j < n - 1; j++) {
      for (int i = j + 1; i < n; i++) {
        if (x[j].compareTo(x[i]) > 0) {
          temp = x[j];
          x[j] = x[i];
          x[i] = temp;
          swap = 1;
        }
        if (swap == 1) {
          System.out.println();
          System.out.println("Sorted");
          printTable(y, x);
          break;
        }
      }
    }
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
    balloonSortGrade(grade, student);
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

  //--------SORTING THE GRADE--------\\
  public static void balloonSortGrade(int a[], String[] x) {
    int n = a.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      int swap = 0;

      for (int j = 0; j < n - i - 1; j++) {
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

  //--------4. Accept pairs of names and grades and sort list according to " +"grade"--------\\
  public static void miscellaneousProcesses() {
    Scanner keyboard = new Scanner(System.in);
    int choice = 0;
    do {
      showMenu3();
      choice = enterChoice(1, 10);
      switch (choice) {
        case 1:
          higherOrLower();
          System.out.println();
          System.out.print("press enter to continue...");
          keyboard.nextLine();
          break;
        case 2:
          covid19();
          break;
        case 3:
          // TO DO
          break;
        case 4:
          // TO DO
          break;
        case 5:
          incomeTaxComputation();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 6:
          insectPopulationGrowthRate();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 7:
          waterBillComputation();
          System.out.println("Press enter to continue...");
          keyboard.nextLine();
          break;
        case 8:
          // TO DO
          break;
        case 9:
          // TO DO
          break;
        case 10:
          showMainMenu();
      } // end of cases
    } while (choice != 10);
  } // end of miscellaneousProcesses method

  //--------------- Miscellenous ---------------\\
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
    String firstName, lastName, address;
    int age, contactNumber;
    int vaccinationCardNo, dateOfMostRecentShot, vaccinationStatus;
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

    System.out.println("Enter your Contact Number");
    contactNumber = input.nextInt();
    System.out.println("Enter your Local Address");
    address = input.nextLine();

    System.out.println(
      "Your Vaccination Status | 1(Full Vaccinated) | 2(Partially Vaccinated) | 3(Not Vaccinated)"
    );
    vaccinationStatus = input.nextInt();

    switch (vaccinationStatus) {
      case 1:
        System.out.println("Full Vaccinated");
        break;
      case 2:
        System.out.println("Partially Vaccinated");
        break;
      case 3:
        System.out.println("Not Vaccinated");
        break;
      default:
        System.out.println("System Error");
    }

    System.out.println("Vaccination Card number.");
    vaccinationCardNo = input.nextInt();
  }

  //--------3. Bills distribution of an amount of Money--------\\

  //--------4. Interest of Money Invested--------\\

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

  //--------9. Mobile Phone Load Balance Computation. --------\\

  //--------10. Back to Main Menu --------\\

}
/*
 * Some basic algorithms:
 * 1. Linear Search(Search an item in a given list)
 * Search an item from a list by starting from the first element, then second,
 * then third an so
 * on.
 * - Check if the first element is the item you are searching.
 * If the first element is the same as the item being searched, stop and report
 * that the item
 * is found. Otherwise, check if the second element is the item you are
 * searching.
 * If the second item is the same as the item being searched, stop and report
 * that the item is
 * found. Otherwise, check if the third element is the same as the item being
 * search...
 * 2. Balloon Sort (Arrange the elements of a list)
 * a. Determine which element should be in the first position:
 * Swap the first element and the second element if needed.
 * Then, swap the current first element and the third element if needed.
 * Then, swap the current first element and the fourth element if needed.
 * ... Repeat the process until the last element is reached.
 * By then, the first element of the list is positioned correctly.
 * b. Determine which element should be in the second position:
 * Swap the second element and the third element if needed.
 * Swap the current second element and the fourth element if needed.
 * .... Repeat the process until the last element is reach.
 * By then, the second element of the list is positioned correctly.
 * ...and so on
 *
 * 3. Selection Sort (Arrange the elements of a list)
 * select a value and put it in its final place into the list
 * repeat for all other values
 * In more detail:
 * find the smallest value in the list
 * switch it with the value in the first position
 * find the next smallest value in the list
 * switch it with the value in the second position
 * repeat until all values are in their proper places
 * Swapping is the process of exchanging two values. Swapping may be a
 * subprocess of the sorting
 * process.
 * Essentially, swapping requires three assignment statements
 * temp = first;
 * first = second;
 * second = temp;
 * In some cases, it is important to keep the original array. A problem/issue in
 * programming
 * theory, which is called side-effect, is the result of modifying the value of
 * a variable (e.g. an
 * array variable). Side-effect is an issue because another module of the
 * program may be using the
 * variable(e.g. the array) under the assumption that the value of the
 * variable(e.g. the elements
 * of the array) is/are in some original form. When the value of the variable is
 * modified, the
 * other module may fail in its purpose.
 * If sorting must be done with an array, create a copy of the array and it is
 * the copy that you
 * should modify. To facility the process of sorting arrays when there is a need
 * to keep the
 *
 * original array, a method for making a copy of an array may help. The
 * following methods are
 * examples of methods for copying arrays.
 * 4. Binary Search (Search an item in a given list)
 * Assume that the list is sorted in ascending order, start the search at the
 * middle cell.
 * If the middle element is the one you are looking for, stop and declare that
 * the item is found.
 * Otherwise, drop half of the list by comparing the item being searched with
 * the middle
 * element.
 * If the middle element is greater than the item being search, this means the
 * item being
 * search could be at the left of the middle element.
 * Then, do the search in the first half of the list (forget about the second
 * half)
 * If the middle element is less than the item being search, this means the item
 * being search
 * could be at the right of the middle element.
 * Then, do the search in the second half of the list (forget about the first
 * half)
 * Again, start the search at the middle cell of the list that remained after
 * dropping half of the
 * list. Do the process repeatedly until the item is found or until there is no
 * more list to be
 * halved.
 */
