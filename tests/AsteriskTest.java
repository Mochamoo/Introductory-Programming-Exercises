import org.junit.Test;

import static org.junit.Assert.*;

public class AsteriskTest {
    @Test
    public void drawAsterisk() throws Exception {
        Asterisk ast = new Asterisk();
        assertEquals("*****", ast.drawAsterisk(5));
    }

}