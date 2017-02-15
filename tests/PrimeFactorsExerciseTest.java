import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeFactorsExerciseTest {
    private PrimeFactorsExercise prime;

    @Before
    public void setup() {
        prime = new PrimeFactorsExercise();
    }

    @Test
    public void testGetPrimeNumbers() {
        //If input is 1, should get back an empty list
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(list, prime.getPrimeNumbers(1));

        //Now test with 30 as input
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(list, prime.getPrimeNumbers(30));
    }
}