import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorsExerciseTest {
    PrimeFactorsExercise prime;

    @Before
    public void setup() {
        prime = new PrimeFactorsExercise();
    }

    @Test
    public void testIsNumberPrime() {
        assertEquals(false, prime.isNumPrime(16));
        assertEquals(true, prime.isNumPrime(17));
    }

    @Test
    public void testGetNextPrime() {
        assertEquals(5, prime.getNextPrime(3));
    }

    @Test
    public void testGetPrimeNumbers() {
        //Assert on String for now, but in final, will need to
        //change return type to ArrayList
        assertEquals("2, 3, 5", prime.getPrimeNumbers(30));
    }
}