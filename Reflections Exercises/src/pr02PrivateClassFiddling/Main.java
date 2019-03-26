package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();

        Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBox = constructor.newInstance();

        Field innerValue = blackBox.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);
        Method[] methods = blackBox.getClass().getDeclaredMethods();

        while (!line.equals("END")) {

            String[] tokens = line.split("_");

            Method method =
                    Arrays.stream(methods)
                            .filter(e -> e.getName()
                                    .equals(tokens[0])).findFirst()
                            .orElse(null);

            method.setAccessible(true);
            method.invoke(blackBox, Integer.parseInt(tokens[1]));
            System.out.println(innerValue.get(blackBox));
            line = bf.readLine();
        }


    }
}
