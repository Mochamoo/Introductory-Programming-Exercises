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
    public void drawAsteriskShouldDrawAsManyAsterisksAsInputSpecified() {
        assertEquals("*****", writer.drawAsterisk(5));
    }

    @Test
    public void drawSpaceShouldInsertAsManySpacesAsInputSpecified() {
        assertEquals("     ", writer.drawSpace(5));
    }

    @Test
    public void drawVerticalLineShouldPutAsterisksOverGivenAmountOfLines() {
        assertEquals("*\n" +
                     "*\n" +
                     "*", writer.drawVerticalLine(3));
    }
}