/* FeetToMeters.java
 *
 * Intro to Programming - Bellevue University
 *
 * Write a program that reads a number in feet, converts it to meters, and displays the result.  One foot is 0.305 meter.
 *
 * Here is a sample run:
 * Enter a value for feet: 16.5 [enter]
 * 16.5 feet is 5.0325 meters
 *
 *
 * Author: Cody Bromwich
 * Date: 1/28/19
 *
 *
 */

import java.util.Scanner;

public class FeetToMeters {

  double CONVERSION_RATE = 0.305;
  // Instantiated default meters value as global variable since instantiating
  //it locally in getInput() cause problems when re-calling
  // due to error handling.
  double meters = 0.0;

  public static void main(String... args) {
    FeetToMeters ftm = new FeetToMeters();

    double feet = ftm.getInput();
    System.out.printf("%.2f feet is equal to %.2f meters", feet, ftm.toMeters(feet));
  }

  // Gets input from user. Returns double, even if user enters an int.
  double getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value for feet: ");
    String input = scanner.nextLine();
    // Checks if user input can be parsed to a double. If not, method starts over
    try {
      meters = Double.parseDouble(input);
      return meters;
    }
    catch (Exception e) {
      System.out.println("Please enter a valid number");
      getInput(); // self call to start method over in order force correct input
    }
    return meters;
  }

  double toMeters(double feet) {
    return feet * CONVERSION_RATE;
  }

}
