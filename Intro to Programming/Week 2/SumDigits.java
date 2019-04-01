import java.util.Scanner;

public class SumDigits {
  public static void main(String... args) {
    SumDigits sd = new SumDigits();

    System.out.println(sd.sumDigits(sd.getInput()));
  }

  String getInput() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    String input = sc.nextLine();
    // Check if the entire string represents a number.
    // Credit to Andy Thomas for this line of code: https://stackoverflow.com/a/34253764
    if (input.chars().allMatch(Character::isDigit)) {
      // Check if the number in the string is between 0 and 1000
      while (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 1000) {
        System.out.print("Enter a number between 0 and 1000: ");
        input = sc.nextLine();
      }
  }
  return input;
}

  int sumDigits(String input) {
    // Initialize the user input as an array of characters
    char[] charArray = input.toCharArray();
    // Variable for keeping track of the sum
    int sum = 0;
    // For each that iterates through the previously created array, gets the
    // numerical value (the string has already been determined to only contain
    // numbers in the input function) at each pass, and adds its value to the sum
    for (char c : charArray) {
      sum += Character.getNumericValue(c);
    }
    return sum;
  }
}
