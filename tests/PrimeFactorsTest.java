import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private PrimeFactors prime;

    @Before
    public void setup() {
        prime = new PrimeFactors();
    }

    @Test
    public void isPrimeShouldReturnTrueWhenGivenPrime() {
        assertEquals(true, prime.isPrime(17));
    }

    @Test
    public void isPrimeShouldReturnFalseWhenGivenNonPrime() {
        assertEquals(false, prime.isPrime(16));
    }

    @Test
    public void getNextPrimeShouldReturnNextPrimeWhenGivenPrime() {
        assertEquals(19, prime.getNextPrime(17));
    }

    @Test
    public void getNextPrimeShouldReturnNextPrimeEvenWithNonPrime() {
        assertEquals(19, prime.getNextPrime(18));
    }

    @Test
    public void generateShouldReturnEmptyListWhenGiven1() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        assertEquals(emptyList, prime.generate(1));
    }

    @Test
    public void generateShouldReturnPrimeWhenGivenPrime() {
        ArrayList<Integer> singlePrime = new ArrayList<>();
        singlePrime.add(5);
        assertEquals(singlePrime, prime.generate(5));
    }

    @Test
    public void generateShouldReturnPrimeFactorsOfNonPrime() {
        ArrayList<Integer> primeFactorsOf30 = new ArrayList<>();
        primeFactorsOf30.add(2);
        primeFactorsOf30.add(3);
        primeFactorsOf30.add(5);
        assertEquals(primeFactorsOf30, prime.generate(30));
    }
}