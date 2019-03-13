package mankind;

public class Student extends Human {

    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() >= 5 && facultyNumber.length() <= 10) {
            this.facultyNumber = facultyNumber;
        } else {
            throw new IllegalArgumentException("Invalid faculty number!");
        }

    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty number: ").append(this.getFacultyNumber());
        return super.toString() + sb.toString();
    }
}
