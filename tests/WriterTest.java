import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WriterTest {
    private Writer writer;

    @Before
    public void setup() {
        writer = new Writer();
    }

    @Test
    public void drawAsteriskShouldDrawFiveAsterisks() throws Exception {
        assertEquals("*****", writer.drawAsterisk(5));
    }

    @Test
    public void drawSpaceShouldInsertFiveSpaces() {
        assertEquals("     ", writer.drawSpace(5));
    }

    @Test
    public void testDrawIsoscelesTriangle() {
        assertEquals("  *\n ***\n*****", writer.drawIsoscelesTriangle(3));
    }

    @Test
    public void testDrawDiamond() {
        String expected = "  *\n ***\n*****\n ***\n  *";
        assertEquals(expected, writer.drawDiamond(3));
    }

    @Test
    public void testDrawDiamondWithName() {
        String expected = "  *\n ***\nEugene\n ***\n  *";
        assertEquals(expected, writer.drawDiamondWithName(3));
    }

    @Test
    public void testEasiestExerciseEver() {
        assertEquals("*", writer.easiestExerciseEver());
    }

    @Test
    public void testDrawHorizontalLine() {
        assertEquals("********", writer.drawHorizontalLine(8));
    }

    @Test
    public void testDrawVerticalLine() {
        assertEquals("*\n*\n*", writer.drawVerticalLine(3));
    }

    @Test
    public void testDrawRightTriangle() {
        assertEquals("*\n**\n***", writer.drawRightTriangle(3));
    }
}