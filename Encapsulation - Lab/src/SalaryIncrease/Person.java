package SalaryIncrease;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public void increaseSalary(Double bonus) {
        if (this.getAge() > 30) {
            this.salary = (this.salary * (bonus / 100)) + this.salary;
        } else {
            this.salary = (this.salary * (bonus / 2) / 100) + this.salary;
        }
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getFirstName()).append(" ").append(this.getLastName())
                .append(" gets ").append(this.getSalary()).append(" ").append("leva");
        return sb.toString();
    }
}
