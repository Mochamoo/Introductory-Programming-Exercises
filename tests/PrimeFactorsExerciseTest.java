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

//Helpful links for this exercise
//http://virtualnerd.com/pre-algebra/factors-fractions-exponents/prime-factorization-greatest-common-factor/prime-factorization/prime-factorization-by-tree
//http://stackoverflow.com/questions/1538644/c-determine-if-a-number-is-prime
//http://stackoverflow.com/questions/5811151/why-do-we-check-up-to-the-square-root-of-a-prime-number-to-determine-if-it-is-pr
