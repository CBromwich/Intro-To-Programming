/* LetterToNumber.java
 *
 * Intro to Programming - Bellevue University
 *
 * 0 0 1 1
 * 0 0 1 1
 * 1 1 0 1
 * 1 0 1 0

 * The largest row index: 2
 * The largest column index: 2
 *
 * Author: Cody Bromwich
 * Date: 3/24/19
 *
 *
 */


import java.util.*;

public class SumMatrix {

  //Global
  int[][] array = new int[4][4];

  public static void main(String... args) {
    SumMatrix sm = new SumMatrix();
    sm.populateArray();
    sm.printArray();
    sm.sumArray();
  }

  void populateArray() {
    // Loops through array and generates values of 0 or 1 for each index of the inner array
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = random.nextInt(2);
      }
    }
  }

  void printArray() {
    // Loops through array and prints each index of the inner array
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("%d ", array[i][j]);
      }
      System.out.println();
    }
  }

  void sumArray() {
    // Keeps track of the highest row/column sum so far
    int rowMax = 0;
    int colMax = 0;
    // Keeps track of the index of the highest sum row/column so far
    int maxRow = 0;
    int maxCol = 0;

    // Loop through array
    for (int i = 0; i < array.length; i++) {
      int rowSum = 0; // Sum of current row. Default 0
      int colSum =0;
      for (int j = 0; j < array[i].length; j++) {
        rowSum += array[i][j]; // Increments the current row value by the value of j
        colSum += array[j][i]; // Increments the current column value by the value of i
      }
      // Compares current row sum to previous highest row sum. If larger, sets max to sum of current row and sets the highest value row to the current one
      if (rowSum > rowMax) {
        rowMax = rowSum;
        maxRow = i;
      }
      else if (colSum > colMax) {
        colMax = colSum;
        maxCol = i;
      }
    }
    System.out.printf("Highest value row: %d \nHighest value column: %d", maxRow, maxCol);
  }
}
