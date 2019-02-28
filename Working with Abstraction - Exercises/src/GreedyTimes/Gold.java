package GreedyTimes;

public class Gold extends Item {

    public Gold(int quantity) {
        super(quantity);
    }

    public void increaseGoldQuantity(int quantity) {
        this.setQuantity(this.getQuantity() + quantity);
    }
}
