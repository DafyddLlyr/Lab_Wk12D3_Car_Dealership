package vehicles.components;

public class Tyre {

    private String model;
    private String make;
    private int size;

    public Tyre(String model, String make, int size) {
        this.model = model;
        this.make = make;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getSize() {
        return size;
    }
}
