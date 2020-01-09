package com.thoughtworks;


import static java.lang.String.valueOf;

public class FizzBuzzUtil {

  public static String fizzBuzz(int number) {
    String correctSlogan = "";
    if (number == 1) correctSlogan += "1";
    if (number == 2) correctSlogan += "2";
    if (valueOf(number).contains("3")) {
      return "Fizz";
    }
    if (number % 3 == 0) correctSlogan += "Fizz";
    if (number % 5 == 0) correctSlogan += "Buzz";
    if (number % 7 == 0) correctSlogan += "Whizz";
    return correctSlogan;
  }
}
