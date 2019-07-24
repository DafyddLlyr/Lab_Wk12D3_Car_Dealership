package vehicles;

import vehicles.components.Engine;
import vehicles.components.EngineType;
import vehicles.components.Tyre;

public abstract class Vehicle {

    private String make;
    private String model;
    private Engine engine;
    private Tyre tyre;
    private int price;

    public Vehicle(String make, String model, Engine engine, Tyre tyre, int price) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.tyre = tyre;
        this.price = price;
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

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
