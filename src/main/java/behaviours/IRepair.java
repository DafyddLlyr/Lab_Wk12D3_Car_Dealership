package behaviours;

import vehicles.Vehicle;

public interface IRepair {

    void repair(Vehicle vehicle, int repairCost);

    void pay(int repairCost);
}
