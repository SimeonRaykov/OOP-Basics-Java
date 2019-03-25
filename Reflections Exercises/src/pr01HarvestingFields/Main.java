package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        while (!line.equals("HARVEST")) {

            String finalLine = line;
            Field[] fields = RichSoilLand.class.getDeclaredFields();

            Field[] requestedFields = Arrays.stream(fields)
                    .filter(e ->
                            Modifier.toString(e.getModifiers()).equals(finalLine))
                    .toArray(Field[]::new);

            if (requestedFields.length != 0) {
                for (Field requestedField : requestedFields) {
                    System.out.println(Modifier.toString(requestedField.getModifiers())
                            + " " + requestedField.getType().getSimpleName() + " " + requestedField.getName());
                }
            } else {
                for (Field requestedField : fields) {
                    System.out.println(Modifier.toString(requestedField.getModifiers())
                            + " " + requestedField.getType().getSimpleName() + " " + requestedField.getName());
                }
            }
            line = bf.readLine();
        }

    }
}
