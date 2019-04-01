/* LetterToNumber.java
 *
 * Intro to Programming - Bellevue University
 *
 * A program that generates 100 random integers 0-9 and prints the occurrence of each
 *
 * Author: Cody Bromwich
 * Date: 3/10/19
 *
 *
 */

import java.util.*;

public class RandomCounts {
  Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
  public static void main(String... args) {
    RandomCounts rc = new RandomCounts();
    rc.generateMap();
    rc.printMap();
  }

  // Iterates through hashmap and prints key : value
  void printMap() {
    for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
      System.out.printf("%d : %d\n", entry.getKey(), entry.getValue());
    }
  }

  void generateMap() {
    Random rand = new Random();
    for (int i = 0; i <= 100; i++) {
      int digit = rand.nextInt(10); // Generate random int between 0 and 9
      if (dict.containsKey(digit)) {
        // If the generated number has already been generated, update the count of that int in the hashmap
        dict.put(digit, dict.get(digit) + 1);
      }
      else {
        // if the current random number is not in the hashmap, create a key,value pair with the current digit as the key
        // and a default of 0 as the value
        dict.put(digit, 0);
      }
    }
  }
}
