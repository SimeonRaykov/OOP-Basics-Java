package PersonInheritance;

import com.sun.nio.sctp.IllegalReceiveException;

public class Child extends Person {

    public Child(String name, int age) {
        super(name,age);
        setAge(age);
        setName(name);
    }

    @Override
    protected void setName(String name) {
        if(name.length()<3){
            throw new IllegalReceiveException("Name's length should not be less than 3 symbols!");
        }
        super.setName(name);
    }

    @Override
    protected void setAge(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        } else {
            super.setAge(age);
        }
    }


}
