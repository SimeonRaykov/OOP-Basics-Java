package vehicle;

import vehicle.models.Car;
import vehicle.models.Truck;
import vehicle.models.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Vehicle> vehicles = new ArrayList<>();
        String carTokens[] = bf.readLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));

        String truckTokens[] = bf.readLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));
        vehicles.add(car);
        vehicles.add(truck);
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String[] commandTokens = bf.readLine().split("\\s+");
            String vehicleString = commandTokens[1];


            if (commandTokens[0].equals("Drive")) {
                if (vehicleString.equals("Car")) {
                    vehicles.get(0).drive(Double.parseDouble(commandTokens[2]));
                } else {
                    vehicles.get(1).drive(Double.parseDouble(commandTokens[2]));
                }
            } else if (commandTokens[0].equals("Refuel")) {
                if (vehicleString.equals("Car")) {
                    vehicles.get(0).refuel(Double.parseDouble(commandTokens[2]));
                } else {
                    vehicles.get(1).refuel(Double.parseDouble(commandTokens[2]));
                }
            }
        }

        System.out.println("Car: " + vehicles.get(0).getFormattedFuelQuantity());
        System.out.println("Truck: " + vehicles.get(1).getFormattedFuelQuantity());
    }
}
