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

  @Test
  public void should_return_Whizz_given_multiple_of_7() {
    assertEquals(fizzBuzz(7), "Whizz");
    assertEquals(fizzBuzz(14), "Whizz");
  }

  @Test
  public void should_return_FizzWhizz_given_multiple_of_3_and_7() {
    assertEquals(fizzBuzz(21), "FizzWhizz");
  }

  @Test
  public void should_return_Fizz_if_contain_3() {
    assertEquals(fizzBuzz(13), "Fizz");
    assertEquals(fizzBuzz(30), "Fizz");
  }

  @Test
  public void should_return_BuzzWhizz_if_contain_5_and_contain_3() {
    assertEquals(fizzBuzz(35), "BuzzWhizz");
  }

  @Test
  public void should_return_BuzzWhizz_if_contain_5_and_multiple_of_5_and_3() {
    assertEquals(fizzBuzz(105), "BuzzWhizz");
  }

  @Test
  public void should_return_Fizz_if_contain_7_and_contain_5_and_multiple_of_3() {
    assertEquals(fizzBuzz(57), "Fizz");
  }

  @Test
  public void should_return_Fizz_if_contain_7_and_multiple_of_5_and_3() {
    assertEquals(fizzBuzz(75), "Fizz");
  }
}
