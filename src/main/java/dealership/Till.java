package dealership;

public class Till {

    Boolean contactlessEnabled;
    private int money;

    public Till(int money) {
        this.money = money;
        this.contactlessEnabled = true;
    }

    public boolean canTakeContactless() {
        return this.contactlessEnabled;
    }

    public int getMoney() {
        return this.money;
    }
}
