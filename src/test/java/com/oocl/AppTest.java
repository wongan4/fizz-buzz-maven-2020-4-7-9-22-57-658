package com.oocl;


import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void should_result_be_number_when_say_normal_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.say(1);

        assertEquals(fizzBuzz.getResult(), "1");
    }
}