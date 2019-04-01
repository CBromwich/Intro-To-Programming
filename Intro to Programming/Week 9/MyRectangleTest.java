/* LetterToNumber.java
 *
 * Intro to Programming - Bellevue University
 *
 * This program tests the constructor and methods of the custom rectangle class
 *
 * Author: Cody Bromwich
 * Date: 3/31/19
 *
 *
 */

public class MyRectangleTest {
  public static void main(String... args) {
    MyRectangle rectangle = new MyRectangle(10, 10, "blue");

    System.out.printf("Width: %.2f\nHeight: %.2f\nArea: %.2f\nColor: %s", rectangle.getWidth(), rectangle.getHeight(), rectangle.findArea(), rectangle.getColor());

    rectangle.setHeight(20);
    rectangle.setWidth(20);
    rectangle.setColor("purple");
    System.out.println("\n");

    System.out.printf("Width: %.2f\nHeight: %.2f\nArea: %.2f\nColor: %s", rectangle.getWidth(), rectangle.getHeight(), rectangle.findArea(), rectangle.getColor());
  }
}
