package vehicle.models;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    public Car(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
        this.setLitersPerKm(this.getLitersPerKm() + 0.9);

    }

    @Override
    public void refuel(double fuel) {
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
