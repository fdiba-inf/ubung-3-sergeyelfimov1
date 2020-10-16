package exercise3;

import java.util.Scanner;

public class NumberSearch {
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    int count = 0;
    for (int number = 100; int number <=1000; number++) {
      if (number % 30 == 0) {
        count++;
      }
    }


  }
}