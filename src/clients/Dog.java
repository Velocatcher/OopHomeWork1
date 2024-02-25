package clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    protected void fly() {
        System.out.println(getType() + " is not flies");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " like to swim");
    }


}
