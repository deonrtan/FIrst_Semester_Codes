package Finals.done;

import java.util.Arrays;
import java.util.Scanner;

//Balloon sort algorithm for String, sorting in lexographic ordering (i.e Alphabetical Ordering)
public class FinalExercise4D {

  public static void main(String[] args) {
    String[] input = { "Zebra", "Anaconda", "Bear", "Crayons", "Guns" };
    int n = input.length;
    BalloonSort(input, n);
    System.out.println("Strings in Ascending sorted order are : ");
    for (int i = 0; i < n; i++) System.out.println(
      "String " + (i + 1) + " is " + input[i]
    );
    balloonSortDescending(input, n);
    System.out.println("Strings in Descending sorted order are : ");
    for (int i = 0; i < n; i++) System.out.println(
      "String " + (i + 1) + " is " + input[i]
    );
  }

  public static void BalloonSort(String[] a, int n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i].compareTo(a[j]) > 0) {
          String temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static void balloonSortDescending(String[] a, int n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i].compareTo(a[j]) < 0) {
          String temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }
}
