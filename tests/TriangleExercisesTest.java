import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleExercisesTest {
    private TriangleExercises tri;

    @Before
    public void setup() {
        tri = new TriangleExercises();
    }

    @Test
    public void testEasiestExerciseEver() {
        assertEquals("*", tri.easiestExerciseEver());
    }

    @Test
    public void testDrawHorizontalLine() {
        assertEquals("********", tri.drawHorizontalLine(8));
    }

    @Test
    public void testDrawVerticalLine() {
        assertEquals("*\n*\n*", tri.drawVerticalLine(3));
    }

    @Test
    public void testDrawRightTriangle() {
        assertEquals("*\n**\n***", tri.drawRightTriangle(3));
    }
}