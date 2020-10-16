package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = 2;
    boolean prime = true;
    while (a > 2) {
      if (a % b == 0) {
        prime = false;
        System.out.println("Prime number: " + prime);
      } else {
        prime = true;
        System.out.println("Prime number: " + prime);
      }
      break;

    }
  }
}
