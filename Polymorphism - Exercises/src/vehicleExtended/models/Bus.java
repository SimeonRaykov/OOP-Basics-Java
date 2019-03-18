package vehicleExtended.models;

import java.text.DecimalFormat;

public class Bus extends Vehicles {
    public Bus(double fuelQuantity, double litersPerKm, double fuelTank) {
        super(fuelQuantity, litersPerKm, fuelTank);
    }

    @Override
    public void refuel(double fuel) {
        if(fuel<=0){
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
        if (km * (this.getLitersPerKm() + 1.4) > this.getFuelQuantity()) {
            System.out.println("Bus needs refueling");
        } else {
            System.out.println("Bus travelled " + hashes.format(km) + " km");
            this.setFuelQuantity(this.getFuelQuantity() - (km * (this.getLitersPerKm() + 1.4)));
        }

    }

    public void driveEmpty(double km) {
        DecimalFormat hashes = new DecimalFormat("#.##");
        if (km * this.getLitersPerKm() > this.getFuelQuantity()) {
            System.out.println("Bus needs refueling");
        } else {
            System.out.println("Bus travelled " + hashes.format(km) + " km");
            this.setFuelQuantity(this.getFuelQuantity() - (km * this.getLitersPerKm()));
        }
    }

}
