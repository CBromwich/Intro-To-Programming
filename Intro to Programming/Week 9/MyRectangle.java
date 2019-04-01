/* LetterToNumber.java
 *
 * Intro to Programming - Bellevue University
 *
 * This program implements a custom rectangle class
 *
 * Author: Cody Bromwich
 * Date: 3/31/19
 *
 *
 */

public class MyRectangle{

  private double width = 1.0;
  private double height = 1.0;
  private static String color = "white";

  public MyRectangle() { }

  public MyRectangle(double widthParam, double heightParam, String colorParam){
    this.width = widthParam;
    this.height = heightParam;
    this.color = colorParam;
  }

  public double getWidth(){
    return this.width;
  }

  public void setWidth(double widthParam){
    this.width = widthParam;
  }

  public double getHeight(){
    return this.height;
  }

  public void setHeight(double heightParam){
    this.height = heightParam;
  }

  public String getColor(){
    return this.color;
  }

  public static void setColor(String colorParam){
    color = colorParam;
  }

  public double findArea(){
    return this.width * this.height;
  }

}
