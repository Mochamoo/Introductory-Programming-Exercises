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
    public void generateShouldReturnEmptyListWhenGiven1() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(list, prime.generate(1));
    }

    @Test
    public void generateShouldReturnPrimeFactorsOfNonPrime() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(list, prime.generate(30));
    }
}