package telephony;

import telephony.classes.Smartphone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Set<String> phones = new LinkedHashSet<>(Arrays.asList(bf.readLine().split("\\s+")));
        Set<String> urls = new LinkedHashSet<>(Arrays.asList(bf.readLine().split("\\s+")));

        Smartphone smartphone = new Smartphone(phones, urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }
}
