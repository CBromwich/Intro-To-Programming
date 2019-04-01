/**
 *
 * Author: Cody Bromwich
 * Purpose: Assignment 5.3 - Write a program to display the provided output.
 * Date: 3-Mar-2019
 * Company: Bellevue University
 * Course: CIS242-305 Intro Programming Using Java
 *
 *
 */

public class PrintSqrt {
  String tableHeader = "| Number | SquareRoot |";
  String separator   = "-----------------------";
  int limit = 20;

  public static void main(String... args) {
    PrintSqrt ps = new PrintSqrt();
    ps.printTable();
  }

  void printTable() {
    System.out.println(separator + "\n" + tableHeader);
    System.out.println(separator);
    for(int i = 0; i <= limit; i++) {
      if(i % 2 == 0) {
        System.out.printf("|   %02d   |   %.4f   |\n", i, Math.sqrt(i));
        System.out.println(separator);
      }
    }
  }
}
