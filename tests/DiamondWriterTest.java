import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondWriterTest {
    private DiamondWriter writer;

    @Before
    public void setup() {
        writer = new DiamondWriter();
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