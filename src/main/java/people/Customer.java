package people;

import behaviours.IBuy;
import vehicles.Vehicle;

public class Customer extends Person implements IBuy {

    public Customer(String name) {
        super(name);
    }

    public String buy(Vehicle vehicle) {
        return "I have bought a " + vehicle.getMake() + " " + vehicle.getModel();
    }
}
