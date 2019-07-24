package vehicles;

import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyre tyre;

    @Before
    public void setup() {
        engine = new Engine(EngineType.ELECTRIC, 1.8, 3000);
        tyre = new Tyre("All Weather Ultra 2000", "Dunlop", 17);
        car = new Car("Tesla", "Roadster", Configurations.CONVERTIBLE, "Red", 35000, engine, tyre);
    }

    @Test
    public void hasMake() {
        assertEquals("Tesla", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Roadster", car.getModel());
    }

    @Test
    public void hasConfiguration() {
        assertEquals(Configurations.CONVERTIBLE, car.getConfiguration());
    }

    @Test
    public void hasColor() {
        assertEquals("Red", car.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(35000, car.getPrice());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasEngineype() {
        assertEquals(EngineType.ELECTRIC, car.getEngineType());
    }

    @Test
    public void hasEngineCapacity() {
        assertEquals(1.8, car.getEngineCapacity(), 0.00);
    }

    @Test
    public void hasEngineHorsePower() {
        assertEquals(3000, car.getEngineHorsepower());
    }

    @Test
    public void hasTyre() {
        assertEquals(tyre, car.getTyre());
    }

    @Test
    public void hasTyreModel() {
        assertEquals("All Weather Ultra 2000", car.getTyreModel());
    }

    @Test
    public void hasTyreMake() {
        assertEquals("Dunlop", car.getTyreMake());
    }

    @Test
    public void hasTyreSize() {
        assertEquals(17, car.getTyreSize());
    }
}
