package TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = bf.readLine().split("\\s+");
        int n = Integer.parseInt(bf.readLine());
        List<TrafficLights> lights = new ArrayList<>();
        for (String token : tokens) {
            lights.add(TrafficLights.valueOf(token));
        }
        Traffic traffic = new Traffic(lights);

        for (int i = 0; i <= traffic.getTrafficLights().size(); i++) {
            traffic.changeTrafficLight();
        }


    }
}
