package vehicleExtended.models;

import java.text.DecimalFormat;

public class Truck extends Vehicles {
    public Truck(double fuelQuantity, double litersPerKm,double fuelTank) {
        super(fuelQuantity, litersPerKm,fuelTank);
        this.setLitersPerKm(this.getLitersPerKm() + 1.6);

    }

    @Override
    public void refuel(double fuel) {
        if(fuel<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if(fuel + this.getFuelQuantity() > this.getFuelTank()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + (fuel * 0.95));
    }

    @Override
    public void drive(double km) {
        DecimalFormat hashes = new DecimalFormat("#.##");
        if (km * this.getLitersPerKm() > this.getFuelQuantity()) {
            System.out.println("Truck needs refueling");
        } else {
            System.out.println("Truck travelled " + hashes.format(km) + " km");
            this.setFuelQuantity(this.getFuelQuantity() - (km * this.getLitersPerKm()));
        }

    }
}