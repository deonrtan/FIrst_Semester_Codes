package Finals.done;

import java.util.Arrays;
import java.util.Scanner;

//Bubble sort algorithm for integers

public class FinalExercise4B {

  public static void swapNumbers(int i, int j, int[] array) {
    int temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void bubbleSort(int array[]) {
    int n = array.length;
    int k;
    for (int m = n; m >= 0; m--) {
      for (int i = 0; i < n - 1; i++) {
        k = i + 1;
        if (array[i] > array[k]) {
          swapNumbers(i, k, array);
        }
      }
      printNumbers(array);
    }
  }

  public static void bubbleSortDescending(int array[]) {
    int n = array.length;
    int k;
    for (int m = n; m >= 0; m--) {
      for (int i = 0; i < n - 1; i++) {
        k = i + 1;
        if (array[i] < array[k]) {
          swapNumbers(i, k, array);
        }
      }
      printNumbers(array);
    }
  }

  private static void printNumbers(int[] input) {
    for (int i = 0; i < input.length; i++) {
      System.out.print(input[i] + ", ");
    }
    System.out.println("\n");
  }

  public static void main(String[] args) {
    int[] input = { 100, -52, 53, -42, 92 };
    System.out.println("Ascending");
    bubbleSort(input);
    System.out.println("Descending");
    int[] input2 = { 100, -52, 53, -42, 92 };
    bubbleSortDescending(input2);
  }
}
