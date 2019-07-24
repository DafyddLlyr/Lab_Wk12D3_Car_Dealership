package vehicles;

import vehicles.components.Engine;
import vehicles.components.Tyre;

public class Car extends Vehicle {

    private String make;
    private String model;
    private Configurations configuration;
    private String color;
    private int price;

    public Car(String Make, String Model, Configurations configuration, String color, int price, Engine engine, Tyre tyre) {
        super(engine, tyre);
        this.make = Make;
        this.model = Model;
        this.configuration = configuration;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public Configurations getConfiguration() {
        return this.configuration;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

}
