package vehicles.components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setup() {
        tyre = new Tyre("All Weather Ultra 2000", "Dunlop", 17);
    }

    @Test
    public void hasModel() {
        assertEquals("All Weather Ultra 2000", tyre.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Dunlop", tyre.getMake());
    }

    @Test
    public void hasSize() {
        assertEquals(17, tyre.getSize());
    }
}
