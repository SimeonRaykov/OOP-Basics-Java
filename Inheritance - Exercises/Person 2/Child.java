package Person;

public class Child extends Person {


    Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setAge(int age) {
        super.setAge(age);
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
    }
}
