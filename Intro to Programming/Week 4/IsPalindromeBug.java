/**
 *
 * Author: Jesse Denson
 * Purpose: Assignment 4.1 - Write a program that determmines if a string is a Palindrome or not but place a bug in it! Hint; there may be two!
 * Date: 22-Feb-2019
 * Company: Bellevue University
 * Course: CIS242-305 Intro Programming Using Java

 *Additional Notes:
 * This program uses string values.
 */


import java.util.*;

class IsPalindrome
{
   public static void main(String args[])
   {
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a number to check if it is a palindrome"); // Semicolon here
      original = in.nextLine();

      int length = original.length();

      for (int i = length - 1; i >= 0; i--) // CHange i <= 0 to i >= 0
         reverse = reverse + original.charAt(i);

      if (original.equals(reverse))
         System.out.println("The number is a palindrome.");
      else
         System.out.println("The number isn't a palindrome.");

   }
}
