package Prelims.exercises;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    for (int y = 1; y <= 10; y++) {
      for (int x = 1; x <= 10; x = x++) {
        System.out.println('*');
      }

      System.out.println('*');
    }
  }
}
