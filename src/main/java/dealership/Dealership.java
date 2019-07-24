package dealership;

import behaviours.IBuy;
import behaviours.IRepair;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy, IRepair {

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

    public String buy(Vehicle vehicle) {
        this.cars.add((Car) vehicle);
        return this.name + " just purchased a " + vehicle.getMake() + " " + vehicle.getModel();
    }

    public void repair(Vehicle vehicle, int repairCost) {
        if(this.getMoney() >= repairCost) {
            int newPrice = vehicle.getPrice() + repairCost;
            vehicle.setPrice(newPrice);
            this.pay(repairCost);
        }
    }

    public void pay(int repairCost) {
        int newBalance = this.till.getMoney() - repairCost;
        this.till.setMoney(newBalance);
    }
}
