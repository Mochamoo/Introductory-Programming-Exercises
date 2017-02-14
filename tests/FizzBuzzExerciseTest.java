import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzExerciseTest {
    FizzBuzzExercise fizz;

    @Before
    public void setUp() {
        fizz = new FizzBuzzExercise();
    }

    @Test
    public void testFizzBuzzSample() {
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\n" +
                "Fizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        assertEquals(expected, fizz.fizzBuzzSample());
    }

}