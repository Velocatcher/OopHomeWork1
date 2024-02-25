package clients;

import java.time.LocalDate;

public class Penguin extends Animal{
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    protected void fly() {
        System.out.println(getType() + " is not flies");
    }


    @Override
    public void crawl() {
        System.out.println(getType() + " is not crawls");
    }
}
