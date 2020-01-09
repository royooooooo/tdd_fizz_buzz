package com.thoughtworks;

import static java.lang.String.valueOf;

public class FizzBuzzUtil {

  public static String fizzBuzz(int number) {
    String correctSlogan = "";
    if (number == 1) correctSlogan += "1";
    if (number == 2) correctSlogan += "2";
    if (isContainsCharacter(number, "5")) {
      correctSlogan += "Buzz";
      if (number % 7 == 0) correctSlogan += "Whizz";
      return correctSlogan;
    } else if (isContainsCharacter(number, "3")) {
      return "Fizz";
    }
    if (number % 3 == 0) correctSlogan += "Fizz";
    if (number % 5 == 0) correctSlogan += "Buzz";
    if (number % 7 == 0) correctSlogan += "Whizz";
    return correctSlogan;
  }

  private static boolean isContainsCharacter(int number, String s) {
    return valueOf(number).contains(s);
  }
}
