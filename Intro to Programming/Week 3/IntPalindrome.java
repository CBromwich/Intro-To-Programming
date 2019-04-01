/* IntPalindrome.java
 *
 * Intro to Programming - Bellevue University
 *
 * Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome integer.  An integer is palindrome if it reads the same from right to left and from left to right.  A negative integer is treated the same as a positive integer.
 *
 * Here are sample runs of this program:
 * Enter a three-digit integer: 121 [enter]
 * 121 is a  palindrome
 *
 * Enter a three-digit integer: 123 [enter]
 * 123 is not a palindrome
 *
 *
 * Author: Cody Bromwich
 * Date: 1/28/19
 *
 *
 */


import java.util.Scanner;

public class IntPalindrome {
  public static void main(String... args) {
    IntPalindrome ip = new IntPalindrome();
    String num = ip.getInput();
    if (ip.isPalindrome(num)) {
      System.out.printf("%s is a palindrome", num);
    }
    else {
      System.out.printf("%s is not a palindrome", num);
    }
  }

/*
 Gets input from user and if it is an integer, return it
*/
  String getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    String input = sc.nextLine();
    // Check if the entire string represents a number.
    // Credit to Andy Thomas for this line of code: https://stackoverflow.com/a/34253764
    while (!input.chars().allMatch(Character::isDigit)) {
      System.out.print("Please enter an integer: ");
      input = sc.nextLine();
    }
    return input;
  }

/*
 Takes a string num and compares it to a reversed num and returns true if they are equal
*/
  boolean isPalindrome(String num) {
    StringBuilder sb = new StringBuilder();
    sb.append(num);
    // Convert both to strings so .equals actually compares the contents of the string and not the reference
    // Before JDK 11, where compareTo was added, StringBuilder.equals compares object reference
    if (sb.toString().equals(sb.reverse().toString())) {
      return true;
    }
    return false;
  }
}
