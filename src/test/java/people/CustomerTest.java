package people;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Configurations;
import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Tyre tyre;
    Car car;

    @Before
    public void setup() {
        customer = new Customer("Bob");
        engine = new Engine(EngineType.ELECTRIC, 1.8, 3000);
        tyre = new Tyre("All Weather Ultra 2000", "Dunlop", 17);
        car = new Car("Tesla", "Roadster", Configurations.CONVERTIBLE, "Red", 35000, engine, tyre);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void canBuyCar() {
        assertEquals("I have bought a Tesla Roadster", customer.buy(car));
    }
}
