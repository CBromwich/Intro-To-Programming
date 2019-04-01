/**
 *
 * Author: Cody Bromwich
 * Purpose: Assignment 4.2 - Write a program to display the provided patterns.
 * Date: 22-Feb-2019
 * Company: Bellevue University
 * Course: CIS242-305 Intro Programming Using Java
 *
 *
 */

class PrintPattern {
  public static void main(String[] args) {
    int limit = 6; // Initial max number to count to per loop
    String seperator = "  "; // Space between numbers
    String precedingSpaces = ""; // Space before numbers in pattern 2
    String pattern = ""; // String to append to for pattern 1

    /*
     Every loop adds current value of i to pattern variable (plus the seperator),
     in sequence from 1 to 6. Every loop results in a string that is 1 number longer than the previous.
    */
    for(int i = 1; i <= limit; i++) {
      pattern += String.valueOf(i) + seperator;
      System.out.println(pattern);
    }

    // Extra space for readabilty
    System.out.print("\n");

    /*
     Every loop, prints preceding spaces (which starts at no spaces), then loops through printing numbers 1 through current limit.
     After this loop, decrease limit by 1 and add 3 spaces to the preceding spaces to keep grid layout.
    */
    for(int i = 1; i <= 6; i++) {
      System.out.print(precedingSpaces);
      for(int j = 1; j <= limit; j++) {
        System.out.print(String.valueOf(j) + seperator);
      }
      limit -= 1;
      System.out.print("\n");
      precedingSpaces += "   ";
    }
  }
}
