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
    public void drawAsteriskShouldDrawFiveAsteriskWhenGivenFive() throws Exception {
        assertEquals("*****", writer.drawAsterisk(5));
    }

    @Test
    public void drawSpaceShouldInsertFiveSpacesWhenGivenFive() {
        assertEquals("     ", writer.drawSpace(5));
    }

    @Test
    public void drawAsteriskShouldDrawOneAsteriskWhenInputIsOne() {
        assertEquals("*", writer.drawAsterisk(1));
    }

    @Test
    public void drawAsteriskShouldReturnEightAsterisksWhenInputIsEight() {
        assertEquals("********", writer.drawAsterisk(8));
    }

    @Test
    public void drawVerticalLineShouldPutAsterisksOverThreeLinesWhenInputIsThree() {
        assertEquals("*\n*\n*", writer.drawVerticalLine(3));
    }

    @Test
    public void drawRightTriangleShouldCreateTriangleOverThreeLinesWhenInputIsThree() {
        assertEquals("*\n**\n***", writer.drawRightTriangle(3));
    }

    @Test
    public void drawIsoscelesTriangleShouldDrawSymmetricalThreeLayeredTriangleWhenInputIsThree() {
        assertEquals("  *\n ***\n*****", writer.drawIsoscelesTriangle(3));
    }

    @Test
    public void drawDiamondShouldDrawDiamondWithSixLayersWhenInputIsThree() {
        String expected = "  *\n ***\n*****\n ***\n  *";
        assertEquals(expected, writer.drawDiamond(3));
    }

    @Test
    public void drawDiamondWithNameShouldDrawDiamondWithNameInThirdRowWhenInputIsThree() {
        String expected = "  *\n ***\nEugene\n ***\n  *";
        assertEquals(expected, writer.drawDiamondWithName(3));
    }
}