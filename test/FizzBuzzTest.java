import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    @Test
    void testFizz3() {
        int number = 3;
        String expected = FIZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz6() {
        int number = 6;
        String expected = FIZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz10() {
        int number = 10;
        String expected = BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = FIZZ_BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = FIZZ_BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}