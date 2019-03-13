package mankind;

import java.text.DecimalFormat;

public class Worker extends Human {

    private double weeklySalary;
    private double workHours;

    public Worker(String firstName, String lastName, double weeklySalary, double workHours) {
        super(firstName, lastName);
        setWeeklySalary(weeklySalary);
        setWorkHours(workHours);
    }

    public double getHourlySalary() {
        return this.weeklySalary / (this.workHours * 7);
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    private void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weeklySalary = weeklySalary;
    }

    private void setWorkHours(double workHours) {
        if (workHours < 1 || workHours > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHours = workHours;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double getWorkHours() {
        return workHours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.00");
        sb.append("Week Salary: ").append(df.format(this.getWeeklySalary())).append(System.lineSeparator())
                .append("Hours per day: ").append(df.format(this.getWorkHours())).append(System.lineSeparator())
                .append("Salary per hour: ").append(df.format(this.getHourlySalary()));

        return super.toString() + sb.toString();
    }
}
