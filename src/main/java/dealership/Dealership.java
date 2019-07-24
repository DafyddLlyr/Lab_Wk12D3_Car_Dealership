package dealership;

import vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String postcode;
    private Till till;
    private ArrayList<Car> cars;

    public Dealership(String name, String postcode, Till till) {
        this.name = name;
        this.postcode = postcode;
        this.till = till;
        this.cars = new ArrayList<Car>();
    }

    public String getName() {
        return this.name;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public Till getTill() {
        return this.till;
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public int getMoney() {
        return this.till.getMoney();
    }
}
