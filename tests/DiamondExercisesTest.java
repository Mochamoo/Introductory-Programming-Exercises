import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondExercisesTest {
    DiamondExercises dia;

    @Before
    public void setup() {
        dia = new DiamondExercises();
    }

    @Test
    public void testDrawIsoscelesTriangle() {
        System.out.println(dia.drawIsoscelesTriangle(3));
        assertEquals("  *\n ***\n*****", dia.drawIsoscelesTriangle(3));
    }
}