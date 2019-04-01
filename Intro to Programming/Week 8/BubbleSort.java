/* LetterToNumber.java
 *
 * Intro to Programming - Bellevue University
 *
 * This program implements bubble sort to sort an array of integers
 *
 * Author: Cody Bromwich
 * Date: 3/24/19
 *
 *
 */

import java.util.Arrays;

public class BubbleSort {
  public static void main(String... args) {
    // Initialize array with random values out of order.
    int[] array = {1, 8, 52, 16, 97, 43, 101};
    // Instantiate this class to call non-static methods.
    BubbleSort bs = new BubbleSort();
    // Print the value returned from sortArray after converting it to a string
    System.out.println(Arrays.toString(bs.sortArray(array)));
  }

  int[] sortArray(int[] array) {
    int tmp; // Temporairly holds one of the two values being evaluated so the other can be assigned its spot
    boolean changed; // Indicates whether a swap has been made. This is changed to true in the loop when the if condition is met
    do {
      changed = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          tmp = array[i]; // Hold the value of array[i] so it can be used to swap into array[i + 1]
          array[i] = array[i + 1]; // Change the value of array[i] to array[i + 1]. This line is why tmp holds array[i]. If it didn't, the original value of array[i] would be overwritten and could not be swapped.
          array[i + 1] = tmp; // Swap array[i] into array[i + 1], the value of which now occupies array[i]
          changed = true; // A value has been swapped, so changed is set to true. The loop ends when no swaps can be made.
        }
      }
    } while (changed);
    return array;
  }
}
