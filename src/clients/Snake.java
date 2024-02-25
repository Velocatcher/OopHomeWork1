package clients;

import java.time.LocalDate;

public class Snake extends  Animal {

    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    protected void fly() {
        System.out.println(getType() + " is not flies");
    }

}
