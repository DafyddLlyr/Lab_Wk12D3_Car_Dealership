package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TillTest {

    Till till;

    @Before
    public void setup() {
        till = new Till(100000);
    }

    @Test
    public void canTakeContacless() {
        assertTrue(till.canTakeContactless());
    }

    @Test
    public void hasMoney() {
        assertEquals(100000, till.getMoney());
    }
}
