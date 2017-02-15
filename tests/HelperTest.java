import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {
    private Helper helper;

    @Before
    public void setup() {
        helper = new Helper();
    }

    @Test
    public void drawAsterisk() throws Exception {
        assertEquals("*****", helper.drawAsterisk(5));
    }

    @Test
    public void drawSpace() {
        assertEquals("     ", helper.drawSpace(5));
    }

}