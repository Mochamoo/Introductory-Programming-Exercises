import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleWriterTest {
    private TriangleWriter writer;

    @Before
    public void setup() {
        writer = new TriangleWriter();
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
}