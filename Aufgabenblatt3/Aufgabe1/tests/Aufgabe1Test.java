import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class Aufgabe1Test {

    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void testDrawNumDiamondOutput1() throws Exception {
        String[] testValues = new String[]{
                "       A       ",
                "      BBB      ",
                "     CCCCC     ",
                "    DDDDDDD    ",
                "   EEEEEEEEE   ",
                "  FFFFFFFFFFF  ",
                " GGGGGGGGGGGGG ",
                "HHHHHHHHHHHHHHH",
                " GGGGGGGGGGGGG ",
                "  FFFFFFFFFFF  ",
                "   EEEEEEEEE   ",
                "    DDDDDDD    ",
                "     CCCCC     ",
                "      BBB      ",
                "       A       "};
        StringBuilder testString = new StringBuilder();
        for(String i: testValues) {
            testString.append(i).append(System.lineSeparator());
        }
        Aufgabe1.drawNumDiamond(15);
        assertEquals(testString.toString(), log.getLog());
    }
    
    @Test
    public void testDrawNumDiamondOutput2() throws Exception {
        Aufgabe1.drawNumDiamond(1);
        assertEquals("A"+System.lineSeparator(), log.getLog());
    }
    
    @Test
    public void testDrawNumDiamondOutput3() throws Exception {
        Aufgabe1.drawNumDiamond(0);
        assertEquals("", log.getLog());
    }
    
    @Test
    public void testDrawNumDiamondOutput4() throws Exception {
        Aufgabe1.drawNumDiamond(6);
        assertEquals("NO VALID INPUT" + System.lineSeparator(), log.getLog());
    }
}

