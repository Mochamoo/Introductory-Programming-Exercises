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
}