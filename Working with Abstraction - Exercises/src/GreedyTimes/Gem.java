package GreedyTimes;


public class Gem extends Item {

    public Gem(String name, int quantity) {
        super(name, quantity);
    }

    public void addQuantity(int quantity){
        this.setQuantity(this.getQuantity() + quantity);
    }

    @Override
    public void setName(String name) {
        if (name.endsWith("gem") && name.length() >= 4) {
            super.setName(name);
        }
    }
}
