import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 45, LocalDate.of
                (2007, 2, 3), new Owner());
        Dog bobik = new Dog("Бобик", 5, LocalDate.of
                (2022, 2, 3), new Owner());
        Duck donald = new Duck("Макдак", 4, LocalDate.of
                (2020, 7, 15), new Owner());
        Fish nemo = new Fish("Немо", 1, LocalDate.of
                (2023, 12, 5), new Owner());
        Penguin rico = new Penguin("Рико", 12, LocalDate.of
                (2011, 3, 11), new Owner());
        Snake naga = new Snake("Нагайна", 5, LocalDate.of
                (2017, 11, 24), new Owner());


        System.out.println(liova.getType());
        System.out.println(liova);
        liova.lifeCycle();
        System.out.println();

        System.out.println(bobik.getType());
        System.out.println(bobik);
        bobik.lifeCycle();
        System.out.println();

        System.out.println(donald.getType());
        System.out.println(donald);
        donald.lifeCycle();
        System.out.println();

        System.out.println(nemo.getType());
        System.out.println(nemo);
        nemo.lifeCycle();
        System.out.println();

        System.out.println(rico.getType());
        System.out.println(rico);
        rico.lifeCycle();
        System.out.println();

        System.out.println(naga.getType());
        System.out.println(naga);
        naga.lifeCycle();
        System.out.println();

//        3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет,
//        оно этого не делало (кошки не летают, рыбы не ходят)


        List<Animal> animals = new ArrayList<>();
        animals.add(liova);
        animals.add(bobik);
        animals.add(donald);
        animals.add(nemo);
        animals.add(rico);
        animals.add(naga);
        for (Animal i:animals) {
            System.out.println(i);
        }

    }
}