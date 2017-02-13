import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleExercisesTest {
    @Test
    public void easiestExerciseEverTest() {
        TriangleExercises tri = new TriangleExercises();
        assertEquals("*", tri.easiestExerciseEver());
    }

    @Test
    public void drawHorizontalLineTest() {
        TriangleExercises tri = new TriangleExercises();
        assertEquals("********", tri.drawHorizontalLine(8));
    }

    
}