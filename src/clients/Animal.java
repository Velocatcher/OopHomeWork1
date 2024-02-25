package clients;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public void lifeCycle() {

        wakeup();
        toGo();
        fly();
        swim();
        crawl();
        eat();
        play();
        sleep();

    }

    private void sleep() {
        System.out.println(getType() + " is sleeping");
    }

    private void wakeup() {
        System.out.println(getType() + " waked up");
    }

//    private void wakeup(double time) {
//        System.out.println(getType() + " waked up at " + time);
//    }

    private void eat() {
        System.out.println(getType() + " is eating");
    }

    private void play() {
        System.out.println(getType() + " is playing");
    }

    //    1) Добавить в класс Animal public методы двигаться(toGo), летать(fly), плавать(swim).
    protected void toGo() {
        System.out.println(getType() + " is moves");
    }

    protected void fly() {
        System.out.println(getType() + " is flies");
    }



    protected void swim() {
        System.out.println(getType() + " is swims");
    }

    protected void crawl() {
        System.out.println(getType() + " is crawls");
    }


    public String getType() {

        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}
