import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleExercisesTest {
    @Test
    public void testEasiestExerciseEver() {
        TriangleExercises tri = new TriangleExercises();
        assertEquals("*", tri.easiestExerciseEver());
    }

    @Test
    public void testDrawHorizontalLine() {
        TriangleExercises tri = new TriangleExercises();
        assertEquals("********", tri.drawHorizontalLine(8));
    }

    @Test
    public void testDrawVerticleLine() {
        TriangleExercises tri = new TriangleExercises();
        assertEquals("*\n*\n*", tri.drawVerticleLine(3));
    }
}