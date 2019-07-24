package people;

import dealership.Dealership;
import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Configurations;
import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Engine engine;
    private Tyre tyre;
    private Car car;
    private Dealership dealership;

    @Before
    public void setup() {
        customer = new Customer("Bob");
        engine = new Engine(EngineType.ELECTRIC, 1.8, 3000);
        tyre = new Tyre("All Weather Ultra 2000", "Dunlop", 17);
        car = new Car("Tesla", "Roadster", Configurations.CONVERTIBLE, "Red", 35000, engine, tyre);
        Till till = new Till(100000);
        dealership = new Dealership("Arnold Clark", "G6 1GG", till);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void canBuyCar() {
        assertEquals("I have bought a Tesla Roadster", customer.buy(car));
    }

    @Test
    public void canRentCar() {
        assertEquals("I have rented a Tesla Roadster", customer.rent(car));
    }

    @Test
    public void canDamageVehicle() {
        customer.damage(car, 20000);
        assertEquals(15000, car.getPrice());
    }

    @Test
    public void cannotDamageVehicleBelow0() {
        customer.damage(car, 1000000);
        assertEquals(0, car.getPrice());
    }

}
