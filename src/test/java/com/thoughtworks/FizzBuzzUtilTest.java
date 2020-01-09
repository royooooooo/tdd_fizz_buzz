package com.thoughtworks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzUtilTest {

  @Test
  public void should_return_same_number_as_given() {
    assertEquals(FizzBuzzUtil.fizzBuzz(1), "1");
    assertEquals(FizzBuzzUtil.fizzBuzz(2), "2");
    assertEquals(FizzBuzzUtil.fizzBuzz(3), "3");
  }
}
