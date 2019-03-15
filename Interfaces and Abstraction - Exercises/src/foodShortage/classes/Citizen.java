package foodShortage.classes;

import foodShortage.interfaces.Buyer;
import foodShortage.interfaces.Identifiable;
import foodShortage.interfaces.Person;

public class Citizen implements Person, Buyer, Identifiable {

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
