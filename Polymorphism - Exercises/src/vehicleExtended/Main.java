package vehicleExtended;

import vehicleExtended.models.Bus;
import vehicleExtended.models.Car;
import vehicleExtended.models.Truck;
import vehicleExtended.models.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Vehicles> vehicles = new ArrayList<>();
        String carTokens[] = bf.readLine().split("\\s+");
        Vehicles car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));

        String truckTokens[] = bf.readLine().split("\\s+");
        Vehicles truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));

        String busTokens[] = bf.readLine().split("\\s+");
        Vehicles bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(bus);
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String[] commandTokens = bf.readLine().split("\\s+");
            String vehicleString = commandTokens[1];

            try {
                if (commandTokens[0].equals("Drive")) {
                    if (vehicleString.equals("Car")) {
                        vehicles.get(0).drive(Double.parseDouble(commandTokens[2]));
                    } else if (vehicleString.equals("Truck")) {
                        vehicles.get(1).drive(Double.parseDouble(commandTokens[2]));
                    } else {
                        vehicles.get(2).drive(Double.parseDouble(commandTokens[2]));
                    }

                } else if (commandTokens[0].equals("Refuel")) {
                    if (vehicleString.equals("Car")) {
                        vehicles.get(0).refuel(Double.parseDouble(commandTokens[2]));
                    } else if (vehicleString.equals("Truck")) {
                        vehicles.get(1).refuel(Double.parseDouble(commandTokens[2]));
                    } else {
                        vehicles.get(2).refuel(Double.parseDouble(commandTokens[2]));
                    }
                } else if (commandTokens[0].equals("DriveEmpty")) {
                    ((Bus) vehicles.get(2)).driveEmpty(Double.parseDouble(commandTokens[2]));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Car: " + vehicles.get(0).getFormattedFuelQuantity());
        System.out.println("Truck: " + vehicles.get(1).getFormattedFuelQuantity());
        System.out.println("Bus: " + vehicles.get(2).getFormattedFuelQuantity());
    }
}
