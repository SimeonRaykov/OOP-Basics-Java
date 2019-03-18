package vehicle.models;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm);
        this.setLitersPerKm(this.getLitersPerKm() + 1.6);

    }

    @Override
    public void refuel(double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + (fuel * 0.95));
    }

    @Override
    public void drive(double km) {
        DecimalFormat hashes = new DecimalFormat("#.##");
        if (km * this.getLitersPerKm() > this.getFuelQuantity() ){
            System.out.println("Truck needs refueling");
        } else{
            System.out.println("Truck travelled " + hashes.format(km) + " km");
            this.setFuelQuantity(this.getFuelQuantity() - (km * this.getLitersPerKm()));
        }

    }
}
