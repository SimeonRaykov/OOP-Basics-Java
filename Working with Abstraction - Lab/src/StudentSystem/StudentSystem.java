package StudentSystem;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] args) {

        if (args[0].equals("Create")) {
            createCommand(args);
        } else if (args[0].equals("Show")) {
            showInfo(args[1]);
        }
    }

    private void showInfo(String arg) {
        if (repo.containsKey(arg)) {
            var student = repo.get(arg);
            String view = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                view += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }

            System.out.println(view);
        }
    }

    private void createCommand(String[] args) {
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade = Double.parseDouble(args[3]);
        if (!repo.containsKey(name)) {
            var student = new Student(name, age, grade);
            repo.put(name, student);
        }
    }
}
