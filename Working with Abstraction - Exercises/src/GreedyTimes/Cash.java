package GreedyTimes;

public class Cash extends Item{

    public Cash(String name, int quantity) {
        super(name, quantity);
    }

    public void addQuantity(int quantity){
        this.setQuantity(this.getQuantity() + quantity);
    }

}
