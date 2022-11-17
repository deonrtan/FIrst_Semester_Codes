package Finals.done;

import java.util.Arrays;
import java.util.Scanner;

//Balloon sort algorithm for integers

public class FinalExercise4A {

  public static void main(String[] args) {
    int[] input = { 4, -50, -2, 562, 12 };
    int n = 6;
    System.out.println("Ascending Order");
    balloonSort(input, n);
    System.out.println("Descending Order");
    balloonSortDescending(input, n);
  }

  public static void balloonSort(int a[], int n) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[i] > a[i + j]) {
          int temp = a[i];
          a[i] = a[i + j];
          a[i + j] = temp;
        }
      }
      printNumbers(a);
    }
  }

  public static void balloonSortDescending(int a[], int n) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[i] < a[i + j]) {
          int temp = a[i];
          a[i] = a[i + j];
          a[i + j] = temp;
        }
      }
      printNumbers(a);
    }
  }

  private static void printNumbers(int[] input) {
    for (int i = 0; i < input.length; i++) {
      System.out.print(input[i] + ", ");
    }
    System.out.println("\n");
  }
}
