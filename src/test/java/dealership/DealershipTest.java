package dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void setup() {
        Till till = new Till(100000);
        dealership = new Dealership("Arnold Clark", "G6 1GG", till);
    }

    @Test
    public void hasName() {
        assertEquals("Arnold Clark", dealership.getName());
    }

    @Test
    public void hasPostcode() {
        assertEquals("G6 1GG", dealership.getPostcode());
    }

    @Test
    public void hasTill() {
        assertNotNull(dealership.getTill());
    }

    @Test
    public void canAccessMoney() {
        assertEquals(100000, dealership.getMoney());
    }

    @Test
    public void canHoldCars() {
        assertEquals(0, dealership.getCars().size());
    }
}
