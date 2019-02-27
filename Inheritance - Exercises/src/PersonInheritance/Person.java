package PersonInheritance;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
       setAge(age);
       setName(name);
    }


    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.getName()).append(", Age: ").append(this.getAge());
        return sb.toString();
    }

}
