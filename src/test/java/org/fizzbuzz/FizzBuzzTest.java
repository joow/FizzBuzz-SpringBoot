package org.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void itShouldReturnTheGivenNumber() {
        assertEquals("1", fizzBuzz.toFizzBuzz(1));
    }

    @Test
    public void itShouldReturnFizzWhenTheGivenNumberIsAMultipleOf3() {
        assertEquals("Fizz", fizzBuzz.toFizzBuzz(3));
    }

    @Test
    public void itShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf5() {
        assertEquals("Buzz", fizzBuzz.toFizzBuzz(5));
    }

    @Test
    public void itShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
        assertEquals("FizzBuzz", fizzBuzz.toFizzBuzz(15));
    }
}
