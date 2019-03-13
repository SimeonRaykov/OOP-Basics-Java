package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] studentTokens = bf.readLine().split("\\s+");
        String[] workerTokens = bf.readLine().split("\\s+");

        try {
            Human student = new Student(studentTokens[0], studentTokens[1], studentTokens[2]);
            System.out.println(student.toString());
            Human worker = new Worker(workerTokens[0], workerTokens[1], Double.parseDouble(workerTokens[2]), Double.parseDouble(workerTokens[3]));
            System.out.println(worker.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
