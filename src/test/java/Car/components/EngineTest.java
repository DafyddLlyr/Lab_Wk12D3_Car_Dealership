package Car.components;

import car.components.EngineType;
import car.components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EngineTest {

    Engine engine;

    @Before
    public void setup() {
        engine = new Engine(EngineType.ELECTRIC, 1.8, 3000);
    }

    @Test
    public void hasType() {
        assertEquals(EngineType.ELECTRIC, engine.getType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1.8, engine.getCapacity(), 0.00);
    }

    @Test
    public void hasHorsePower() {
        assertEquals(3000, engine.getHorsepower());
    }
}
