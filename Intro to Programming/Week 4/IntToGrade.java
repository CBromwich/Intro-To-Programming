/**
 *
 * Author: Cody Bromwich
 * Purpose: Assignment 4.3 - Write a program to output a value that maps to a letter grade
 * Date: 22-Feb-2019
 * Company: Bellevue University
 * Course: CIS242-305 Intro Programming Using Java
 *
 *
 */

import java.util.*;

public class IntToGrade {

  // My own implementation of a dictionary in Java, maps key,value pairs.
  static Map<String, String> dictionary = new HashMap<String, String>();

  public static void main(String... args) {
    IntToGrade itg = new IntToGrade();
    setDict();
    itg.convertGrade();
  }

  // Constructs the dictionary values to be referenced later.
  static void setDict() {
    dictionary.put("A", "1");
    dictionary.put("B", "2");
    dictionary.put("C", "3");
    dictionary.put("D", "4");
    dictionary.put("F", "5");
  }

  String getInput() {
    System.out.print("Enter a grade: ");
    return new Scanner(System.in).nextLine();
  }

  // If the letter input is a key in the dictionary, print the int equivalent
  void convertGrade() {
    String grade = getInput().toUpperCase();
    if(dictionary.containsKey(grade)) {
      System.out.printf("%s is equivalent to %s", grade, dictionary.get(grade));
    }
    else {
      System.out.printf("%s is not a valid grade", grade);
    }
  }
}
