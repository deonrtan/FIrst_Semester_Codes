package Finals.done;

import java.util.Arrays;
import java.util.Scanner;

//Bubble sort algorithm for integers

public class FinalExercise4B {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int length; // the length of the array
    System.out.println("input the length of the numbers: ");
    length = input.nextInt();
    // declare and instantiate object
    int number[] = new int[length];
    //using loops to determine how many times it the user can input a data
    for (int i = 0; i <= number.length - 1; i++) {
      System.out.println("enter the array element of " + (i + 1));
      number[i] = input.nextInt();
    }

    for (int i = 0; i < number.length - 1; i++) { // used to break the "for loops" if the numbers are sorted
      // check if swapping occurs
      boolean swapped = false;

      // loop to compare adjacent elements
      for (int k = 0; k < (number.length - i - 1); k++) {
        // compare two array elements
        // change > to < to sort in descending order
        if (number[k] > number[k + 1]) { //if the number is greater than the next number it swaps them, that's why its k+1, the next element in the array;
          // swapping occurs if elements
          // are not in the intended order
          int temp = number[k]; //creating a new variable temp, to temporary place the data in that variable
          number[k] = number[k + 1];
          number[k + 1] = temp; // putting the temporary data to the arrange data 
          swapped = true; // swap = true, if it matches the statement
        }
      }
      // no swapping means the array is already sorted
      // so no need for further comparison
      if (!swapped) break;
    }

    System.out.println("Sorted");
    System.out.println(Arrays.toString(number));
  }
}
