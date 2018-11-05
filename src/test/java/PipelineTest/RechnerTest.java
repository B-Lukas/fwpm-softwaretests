package PipelineTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RechnerTest {

    @Test
    public void testAddition() {
        assertEquals(5, (Rechner.addition(4, 1)));
    }

    @Test
    public void testAddition2() {
        assertEquals(6, (Rechner.addition(3, 3)));
    }

    @Test
    public void testAddition3() {
        assertEquals(6, (Rechner.addition(4, 3)));
    }
}
