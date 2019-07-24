package dealership;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Configurations;
import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DealershipTest {

    private Dealership dealership;
    private Car car;
    Till till;

    @Before
    public void setup() {
        till = new Till(100000);
        dealership = new Dealership("Arnold Clark", "G6 1GG", till);
        Engine engine = new Engine(EngineType.ELECTRIC, 1.8, 3000);
        Tyre tyre = new Tyre("All Weather Ultra 2000", "Dunlop", 17);
        car = new Car("Tesla", "Roadster", Configurations.CONVERTIBLE, "Red", 35000, engine, tyre);
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

    @Test
    public void canBuyCars() {
        assertEquals("Arnold Clark just purchased a Tesla Roadster", dealership.buy(car));
    }

    @Test
    public void buyingCarAddsToDealership() {
        dealership.buy(car);
        assertEquals(1, dealership.getCars().size());
        assertTrue(dealership.getCars().contains(car));
    }

    @Test
    public void canRepairCar() {
        dealership.repair(car, 1000);
        assertEquals(36000, car.getPrice());
        assertEquals(99000, dealership.getMoney());
    }

    @Test
    public void cannotRepairCarWithoutFunds() {
        till.setMoney(0);
        dealership.repair(car, 1000);
        assertEquals(35000, car.getPrice());
        assertEquals(0, dealership.getMoney());
    }
}
