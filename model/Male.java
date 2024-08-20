package model;

import entity.Person;

public class Male extends Person {
    public boolean isAgeEnough() {
        return this.age > 18;
    }
}
