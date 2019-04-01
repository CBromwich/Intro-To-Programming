/* LetterToNumber.java
 *
 * Intro to Programming - Bellevue University
 *
 * A program that overloads four methods per assignment.
 *
 * Author: Cody Bromwich
 * Date: 3/10/19
 *
 *
 */

public class MethodOverload {
  public static void main(String... args) {
    MethodOverload mo = new MethodOverload();

    // Hard coded tests for each function. One for each with a high,low sequence
    // and one with a low,high sequence to test that the smaller number is always
    // subtracted from the larger.
    System.out.println(mo.difference(5, 6));
    System.out.println(mo.difference(18, 4));
    System.out.println(mo.difference(5.0, 6.0));
    System.out.println(mo.difference(18.0, 4.0));
    System.out.println(mo.difference(5, 6.0));
    System.out.println(mo.difference(18, 4.0));
    System.out.println(mo.difference(5.0, 6));
    System.out.println(mo.difference(18.0, 4));
  }

  /*
   *  The expression "return a > b ? a - b :  b - a;" is a ternary expression that
   *  checks if a is larger than b, and if so returns a - b; if not returns b - a.
   *  This guarantees that the larger number is always subtracting the smaller. This
   *  can also be accomplished by ignoring which number is higher and just returning
   *  Math.abs(a - b).
   */

  int difference(int a, int b) {
    return a > b ? a - b :  b - a;
  }

  double difference(double a, double b) {
    return a > b ? a - b :  b - a;
  }

  double difference(int a, double b) {
    return a > b ? a - b :  b - a;
  }
  double difference(double a, int b) {
    return a > b ? a - b :  b - a;
  }
}
