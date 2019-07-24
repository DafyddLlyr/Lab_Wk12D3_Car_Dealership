package car.components;

public class Engine {

    private EngineType type;
    private double capacity;
    private int horsepower;

    public Engine(EngineType type, double capacity, int horsepower) {
        this.type = type;
        this.capacity = capacity;
        this.horsepower = horsepower;
    }

    public EngineType getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
