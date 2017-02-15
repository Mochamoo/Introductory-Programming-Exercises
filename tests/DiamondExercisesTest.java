import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondExercisesTest {
    private DiamondExercises dia;

    @Before
    public void setup() {
        dia = new DiamondExercises();
    }

    @Test
    public void testDrawIsoscelesTriangle() {
        assertEquals("  *\n ***\n*****", dia.drawIsoscelesTriangle(3));
    }

    @Test
    public void testDrawDiamond() {
        String expected = "  *\n ***\n*****\n ***\n  *";
        assertEquals(expected, dia.drawDiamond(3));
    }

    @Test
    public void testDrawDiamondWithName() {
        String expected = "  *\n ***\nEugene\n ***\n  *";
        assertEquals(expected, dia.drawDiamondWithName(3));
    }

}