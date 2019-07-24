package vehicles;

import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

public abstract class Vehicle {

    private String make;
    private String model;
    private Engine engine;
    private Tyre tyre;

    public Vehicle(String make, String model, Engine engine, Tyre tyre) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
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
