package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String command = bf.readLine();
        while (!command.equals("Beast!")) {

            String type = command;
            String[] info = bf.readLine().split("\\s+");
            try {
                if (type.equals("Cat")) {
                    Animal cat = new Cat(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(cat.toString());
                    System.out.println(cat.produceSound());
                } else if (type.equals("Dog")) {
                    Animal dog = new Dog(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(dog.toString());
                    System.out.println(dog.produceSound());
                } else if (type.equals("Frog")) {
                    Animal frog = new Frog(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(frog.toString());
                    System.out.println(frog.produceSound());
                } else if (type.equals("Kitten")) {
                    Animal kitten = new Kitten(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(kitten.toString());
                    System.out.println(kitten.produceSound());
                } else if (type.equals("Tomcat")) {
                    Animal tomcat = new Tomcat(info[0], Integer.parseInt(info[1]), info[2]);
                    System.out.println(tomcat.toString());
                    System.out.println(tomcat.produceSound());
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

            command = bf.readLine();
        }


    }
}
