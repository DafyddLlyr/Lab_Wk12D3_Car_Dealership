package people;

import behaviours.IDamage;

public abstract class Person implements IDamage {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
