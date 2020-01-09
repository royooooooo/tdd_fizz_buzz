package com.thoughtworks;

import static com.thoughtworks.FizzBuzzUtil.fizzBuzz;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzUtilTest {

  @Test
  public void should_return_same_number_as_given() {
    assertEquals(fizzBuzz(1), "1");
    assertEquals(fizzBuzz(2), "2");
  }

  @Test
  public void should_return_Fizz_given_multiple_of_3() {
    assertEquals(fizzBuzz(3), "Fizz");
    assertEquals(fizzBuzz(9), "Fizz");
  }

  @Test
  public void should_return_Buzz_given_multiple_of_5() {
    assertEquals(fizzBuzz(5), "Buzz");
    assertEquals(fizzBuzz(25), "Buzz");
  }
}
