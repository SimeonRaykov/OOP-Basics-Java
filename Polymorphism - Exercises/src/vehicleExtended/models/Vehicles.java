package vehicleExtended.models;

import java.text.DecimalFormat;

public abstract class Vehicles {
    private double fuelQuantity;
    private double litersPerKm;
    private double fuelTank;


    public Vehicles(double fuelQuantity, double litersPerKm,double fuelTank) {
        if(fuelQuantity > fuelTank){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
        this.fuelTank = fuelTank;
    }


    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public String getFormattedFuelQuantity() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(this.getFuelQuantity());
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public abstract void refuel(double fuel);

    public abstract void drive(double km);
}
