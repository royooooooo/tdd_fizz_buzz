package com.thoughtworks;

import static java.lang.String.valueOf;

public class FizzBuzzUtil {

  public static String fizzBuzz(int number) {
    String correctSlogan = "";
    if (isContainsCharacter(number, "7")) {
      if (isContainsCharacter(number, "3")) {
        return "Fizz";
      }
      if (number % 3 == 0) correctSlogan += "Fizz";
      if (number % 7 == 0) correctSlogan += "Whizz";
      return correctSlogan;
    } else if (isContainsCharacter(number, "5")) {
      correctSlogan += "Buzz";
      if (number % 7 == 0) correctSlogan += "Whizz";
      return correctSlogan;
    } else if (isContainsCharacter(number, "3")) {
      return "Fizz";
    }
    if (number % 3 == 0) correctSlogan += "Fizz";
    if (number % 5 == 0) correctSlogan += "Buzz";
    if (number % 7 == 0) correctSlogan += "Whizz";
    if (correctSlogan.equals("")) correctSlogan += number;
    return correctSlogan;
  }

  private static boolean isContainsCharacter(int number, String s) {
    return valueOf(number).contains(s);
  }
}
