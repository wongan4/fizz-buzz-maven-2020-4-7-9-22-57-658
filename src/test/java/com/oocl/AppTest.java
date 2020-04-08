package com.oocl;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_result_be_number_when_say_normal_number() {
        fizzBuzz.say(1);
        assertEquals(fizzBuzz.getResult(), "1");
    }

    @Test
    public void should_result_be_fizz_when_say_multiple_of_three() {
        fizzBuzz.say(3);
        assertEquals(fizzBuzz.getResult(), "fizz");
    }

    @Test
    public void should_result_be_fizz_when_say_multiple_of_five() {
        fizzBuzz.say(5);
        assertEquals(fizzBuzz.getResult(), "Buzz");
    }
}