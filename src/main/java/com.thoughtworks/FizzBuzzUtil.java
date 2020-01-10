package com.thoughtworks;

import static java.lang.String.valueOf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzzUtil {

  public static Map<Integer, String> specificNumberAndSlogan;

  static {
    specificNumberAndSlogan = new HashMap<>();
    specificNumberAndSlogan.put(3, "Fizz");
    specificNumberAndSlogan.put(5, "Buzz");
    specificNumberAndSlogan.put(7, "Whizz");
  }

  public static String fizzBuzz(int number) {
    String correctSlogan = "";
    if (isContainsCharacter(number, 7)) {
      if (isContainsCharacter(number, 3)) {
        return specificNumberAndSlogan.get(3);
      }
      correctSlogan += getSloganByMultipleOfSpecificNumbers(number, new int[] {3, 7});
      return correctSlogan;
    }else if (isContainsCharacter(number, 5)) {
      correctSlogan += specificNumberAndSlogan.get(5);
      correctSlogan += getSloganByMultipleOfSpecificNumbers(number, new int[] {7});
      return correctSlogan;
    }else if (isContainsCharacter(number, 3)) {
      return specificNumberAndSlogan.get(3);
    }
    correctSlogan += getSloganByMultipleOfSpecificNumbers(number, new int[] {3, 5, 7});
    if (correctSlogan.equals("")) correctSlogan += number;
    return correctSlogan;
  }

  private static String getSloganByMultipleOfSpecificNumbers(int number, int[] specificNumbers) {
    return Arrays.stream(specificNumbers)
        .boxed()
        .map(
            specificNumber ->
                number % specificNumber == 0 ? specificNumberAndSlogan.get(specificNumber) : "")
        .reduce("", String::concat);
  }

  private static boolean isContainsCharacter(int number, int specificNumber) {
    return valueOf(number).contains(valueOf(specificNumber));
  }
}
