/* IntToMonth.java
 *
 * Intro to Programming - Bellevue University
 *
 * Write a program that randomly generates an integer between 1 and 12 and displays
 * the English month names January, February, ... December for the numbers 1,2, ... 12, accordingly.
 *
 * Author: Cody Bromwich
 * Date: 1/28/19
 *
 *
 */

import java.util.Random;

public class IntToMonth {

  static String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

  public static void main(String... args) {
    IntToMonth itm = new IntToMonth();
    int randomInt = itm.generateRandInt();
    System.out.printf("The month corresponding to %d is %s", randomInt, months[randomInt-1]);
  }

  // Generates a random integer between 0 and 11 (Random.nextInt returns a range between 0 and n exclusive)
  // Adds 1 to generated number to bring range to 1-12 per assignment
  int generateRandInt() {
    return new Random().nextInt(12) + 1;
  }
}
