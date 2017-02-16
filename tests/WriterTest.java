import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WriterTest {
    private Writer writer;

    @Before
    public void setup() {
        writer = new Writer();
    }

    @Test
    public void drawAsteriskShouldDrawAsManyAsterisksAsInput() {
        assertEquals("*****", writer.drawAsterisk(5));
    }

    @Test
    public void drawSpaceShouldInsertAsManySpacesAsInput() {
        assertEquals("     ", writer.drawSpace(5));
    }


    @Test
    public void drawVerticalLineShouldPutAsterisksOverNumberOfLinesAsInput() {
        assertEquals("*\n" +
                     "*\n" +
                     "*", writer.drawVerticalLine(3));
    }

    @Test
    public void drawRightTriangleShouldCreateTriangleOverNumberOfLinesAsInput() {
        assertEquals("*\n" +
                     "**\n" +
                     "***", writer.drawRightTriangle(3));
    }

    @Test
    public void drawIsoscelesTriangleShouldDrawSymmetricalTriangleWithNumberOfLinesAsInput() {
        assertEquals("  *\n" +
                     " ***\n" +
                     "*****", writer.drawIsoscelesTriangle(3));
    }

    @Test
    public void drawDiamondShouldDrawDiamondWithNumberOfLinesAsInput() {
        assertEquals("  *\n" +
                     " ***\n" +
                     "*****\n" +
                     " ***\n" +
                     "  *", writer.drawDiamond(3));
    }

    @Test
    public void drawDiamondWithNameShouldInsertNameIntoMiddleRowOfDiamond() {
        assertEquals("  *\n" +
                     " ***\n" +
                     "Eugene\n" +
                     " ***\n" +
                     "  *", writer.drawDiamondWithName(3));
    }
}