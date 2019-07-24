package vehicles;

import vehicles.components.Engine;
import vehicles.components.Tyre;

public class Car extends Vehicle {

    private Configurations configuration;
    private String color;
    private int price;

    public Car(String make, String model, Configurations configuration, String color, int price, Engine engine, Tyre tyre) {
        super(make, model, engine, tyre);
        this.configuration = configuration;
        this.color = color;
        this.price = price;
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
