import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HofstadterTest {
    @Test
    public void testGSequence() {
        Hofstadter hofstadter = new Hofstadter();

        assertEquals(0, hofstadter.gSequence(0));
        assertEquals(1, hofstadter.gSequence(1));
        assertEquals(1, hofstadter.gSequence(2));
        assertEquals(2, hofstadter.gSequence(3));
        assertEquals(3, hofstadter.gSequence(4));
        assertEquals(3, hofstadter.gSequence(5));
        assertEquals(4, hofstadter.gSequence(6));
        assertEquals(4, hofstadter.gSequence(7));
        assertEquals(5, hofstadter.gSequence(8));
    }


}


