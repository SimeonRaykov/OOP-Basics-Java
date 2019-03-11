package Person;

public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    protected void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.getName()).append(", Age: ").append(this.getAge());
        return sb.toString();
    }
}
