package clients;

import java.time.LocalDate;

public class Lion extends Animal {


    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }




    @Override
    protected void fly() {
        System.out.println(getType() + " is not flies");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " is doesn`t like to swim");
    }

    @Override
    public void crawl() {
        System.out.println(getType() + " is not crawls");
    }

}
