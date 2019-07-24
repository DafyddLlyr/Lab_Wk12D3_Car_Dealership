package vehicles;

import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

public abstract class Vehicle {

    private Engine engine;
    private Tyre tyre;

    public Vehicle(Engine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tyre getTyre() {
        return this.tyre;
    }

    public String getTyreModel() {
        return this.tyre.getModel();
    }

    public String getTyreMake() {
        return this.tyre.getMake();
    }

    public int getTyreSize() {
        return this.tyre.getSize();
    }

    public EngineType getEngineType() {
        return this.engine.getType();
    }

    public double getEngineCapacity() {
        return this.engine.getCapacity();
    }

    public int getEngineHorsepower() {
        return this.engine.getHorsepower();
    }
}
