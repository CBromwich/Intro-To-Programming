/* MyStringTest.java
 *
 * Intro to Programming - Bellevue University
 *
 * This program reverses a string
 *
 * Author: Cody Bromwich
 * Date: 3/31/19
 *
 *
 */

public class MyStringTest {
  public static void main(String... args) {
    String string = new String("I probably shouldn't use a palindrome for this");

    for (int i = string.length() - 1; i >= 0; i--) {
      System.out.print(string.charAt(i));
    }
  }
}
