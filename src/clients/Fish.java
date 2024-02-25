package clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    protected void fly() {
        System.out.println(getType() + " is not flies");
    }
    @Override
    protected void toGo() {
        System.out.println(getType() + " is not moves");
    }
    @Override
    public void crawl() {
        System.out.println(getType() + " is not crawls");
    }
}
