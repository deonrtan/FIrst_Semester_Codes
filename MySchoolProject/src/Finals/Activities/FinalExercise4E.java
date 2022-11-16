package Finals.Activities;

import java.util.Arrays;
import java.util.Scanner;

//Bubble sort algorithm for String, sorting in lexographic ordering (i.e Alphabetical Ordering)
public class FinalExercise4E {

  static int MAX = 100;

  public static void sortStrings(String[] arr, int n) {
    String temp;

    // Sorting strings using bubble sort
    for (int j = 0; j < n - 1; j++) {
      for (int i = j + 1; i < n; i++) {
        if (arr[j].compareTo(arr[i]) > 0) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
  }

  // Driver code
  public static void main(String[] args) {
    String[] arr = { "Zebra", "Anaconda", "Gray", "South", "Window" };
    int n = arr.length;
    sortStrings(arr, n);
    System.out.println("Strings in sorted order are : ");
    for (int i = 0; i < n; i++) System.out.println(
      "String " + (i + 1) + " is " + arr[i]
    );
  }
}
