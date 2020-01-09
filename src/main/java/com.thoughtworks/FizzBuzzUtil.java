package com.thoughtworks;

public class FizzBuzzUtil {

  public static String fizzBuzz(int number) {
    String correctSlogan = "";
    if (number == 1) correctSlogan += "1";
    if (number == 2) correctSlogan += "2";
    if (number % 3 == 0) correctSlogan += "Fizz";
    if (number % 5 == 0) correctSlogan += "Buzz";
    if (number % 7 == 0) correctSlogan += "Whizz";
    return correctSlogan;
  }
}
