package com.thoughtworks;

public class FizzBuzzUtil {

  public static String fizzBuzz(int number) {
    if (number == 1) return "1";
    if (number == 2) return "2";
    if (number % 3 == 0) return "Fizz";
    if (number % 5 == 0) return "Buzz";
    if (number % 7 == 0) return "Whizz";
    return null;
  }
}
