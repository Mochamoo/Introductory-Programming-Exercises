import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizz;

    @Before
    public void setUp() {
        fizz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldFizzAndBuzzOnNumbersDivisibleByThreeAndFive() {
        assertEquals("1\n" +
                     "2\n" +
                     "Fizz\n" +
                     "4\n" +
                     "Buzz\n" +
                     "Fizz\n" +
                     "7\n" +
                     "8\n" +
                     "Fizz\n" +
                     "Buzz\n" +
                     "11\n" +
                     "Fizz\n" +
                     "13\n" +
                     "14\n" +
                     "FizzBuzz\n", fizz.fizzBuzz(15));
    }

}