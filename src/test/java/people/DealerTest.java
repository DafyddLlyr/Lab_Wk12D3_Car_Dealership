package people;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Configurations;
import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    Car car;

    @Before
    public void setup() {
        dealer = new Dealer("Dave");
        Engine engine = new Engine(EngineType.ELECTRIC, 1.8, 3000);
        Tyre tyre = new Tyre("All Weather Ultra 2000", "Dunlop", 17);
        car = new Car("Tesla", "Roadster", Configurations.CONVERTIBLE, "Red", 35000, engine, tyre);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", dealer.getName());
    }

    @Test
    public void canDamageVehicle() {
        dealer.damage(car, 20000);
        assertEquals(15000, car.getPrice());
    }

    @Test
    public void cannotDamageVehicleBelow0() {
        dealer.damage(car, 1000000);
        assertEquals(0, car.getPrice());
    }
}
