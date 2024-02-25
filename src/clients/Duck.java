package clients;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public void crawl() {
        System.out.println(getType() + " is not crawls");
    }
}
