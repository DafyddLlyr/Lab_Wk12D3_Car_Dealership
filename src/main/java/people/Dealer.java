package people;

import vehicles.Vehicle;

public class Dealer extends Person {

    public Dealer(String name) {
        super(name);
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
