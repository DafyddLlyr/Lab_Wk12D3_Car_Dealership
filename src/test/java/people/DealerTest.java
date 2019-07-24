package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setup() {
        dealer = new Dealer("Dave");
    }

    @Test
    public void hasName() {
        assertEquals("Dave", dealer.getName());
    }
}
