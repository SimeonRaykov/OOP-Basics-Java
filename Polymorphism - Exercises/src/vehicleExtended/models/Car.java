package vehicleExtended.models;

import java.text.DecimalFormat;

public class Car extends Vehicles {
    public Car(double fuelQuantity, double litersPerKm, double fuelTank) {
        super(fuelQuantity, litersPerKm, fuelTank);
        this.setLitersPerKm(this.getLitersPerKm() + 0.9);

    }

    @Override
    public void refuel(double fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if (fuel + this.getFuelQuantity() > this.getFuelTank()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }

    @Override
    public void drive(double km) {
        DecimalFormat hashes = new DecimalFormat("#.##");
        if (km * this.getLitersPerKm() > this.getFuelQuantity()) {
            System.out.println("Car needs refueling");
        } else {
            System.out.println("Car travelled " + hashes.format(km) + " km");
            this.setFuelQuantity(this.getFuelQuantity() - (km * this.getLitersPerKm()));

        }

    }
}
