package AnimalFarm;

public class Chicken {

    private String name;
    private int age;
    private static final int MAX_AGE = 15;
    private static final int MIN_AGE = 0;

    public Chicken(String name, int age) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (age >= MAX_AGE || age <= MIN_AGE) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    public double calcProductPerDay() {
        double eggsPerDay = 0;
        if (this.getAge() <= 5 && this.getAge() >= 0) {
            eggsPerDay = 2;
        } else if (this.getAge() >= 6 && this.getAge() <= 11) {
            eggsPerDay = 1;
        } else if (this.getAge() <= 15) {
            eggsPerDay = 0.75;
        }
        return eggsPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
