package Finals.Activities;

import java.util.Arrays;
import java.util.Scanner;

//Balloon sort algorithm for integers

public class FinalExercise4A {

  public static void BallonSort(int a, int n[]) {
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n.length - i; j++) {
        if (a[j] > a[i + j]) {
          int temp = a[i + j];
        }
      }
    }
  }
}
