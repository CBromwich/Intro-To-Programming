/**
 *
 * Author: Cody Bromwich
 * Purpose: Assignment 5.4 - Write a program to sum the digits in a long.
 * Date: 22-Feb-2019
 * Company: Bellevue University
 * Course: CIS242-305 Intro Programming Using Java
 *
 *
 */

import java.util.Scanner;

public class SumDigits {
  public static void main(String... args) {
    SumDigits sd = new SumDigits();
    long input = sd.getInput();
    int sum = sd.sumDigits(input);
    System.out.printf("The sum of the digits in %d is %d", input, sum);
  }

  long getInput() {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    String input = in.nextLine();

    if (input.chars().allMatch(Character::isDigit)) {
      return Long.parseLong(input);
    }
    else {
      return getInput();
    }
  }

  public static int sumDigits(long lg) {
    char[] charArray = String.valueOf(lg).toCharArray();
    int sum = 0;
    for (char c : charArray) {
      sum += Character.getNumericValue(c);
    }
    return sum;
  }
}
