package people;

import behaviours.IBuy;
import behaviours.IRent;
import vehicles.Vehicle;

public class Customer extends Person implements IBuy, IRent {

    public Customer(String name) {
        super(name);
    }

    public String buy(Vehicle vehicle) {
        return "I have bought a " + vehicle.getMake() + " " + vehicle.getModel();
    }

    public String rent(Vehicle vehicle) {
        return "I have rented a " + vehicle.getMake() + " " + vehicle.getModel();
    }

    public void damage(Vehicle vehicle, int damageCost) {
        if(damageCost <= vehicle.getPrice()) {
            int newPrice = vehicle.getPrice() - damageCost;
            vehicle.setPrice(newPrice);
        } else {
            vehicle.setPrice(0);
        }
    }
}
