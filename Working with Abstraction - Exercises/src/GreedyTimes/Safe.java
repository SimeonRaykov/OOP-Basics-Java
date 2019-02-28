package GreedyTimes;

import java.util.ArrayList;
import java.util.List;

public class Safe {

    private long capacity;
    private Gold gold;
    private List<Gem> gems;
    private List<Cash> cash;

    public Safe(long capacity) {
        this.capacity = capacity;
        this.gold = new Gold(0);
        this.gems = new ArrayList<>();
        this.cash = new ArrayList<>();
    }

    public void addGem(String gem, int quantity) {
        for (Gem gem1 : getGems()) {
            if (gem1.getName().equals(gem)) {
                gem1.addQuantity(quantity);
                return;
            }
        }
        this.getGems().add(new Gem(gem, quantity));
    }

    public void addCash(String cash, int quantity) {
        for (Cash cash1 : getCash()) {
            if (cash1.getName().equals(cash)) {
                cash1.addQuantity(quantity);
                return;
            }
        }
        this.getCash().add(new Cash(cash,quantity));


    }

    public int getTotalQuantity() {
        return this.getCashQuantity() + this.getGoldQuantity() + this.getGemQuantity();
    }

    public int getGoldQuantity() {
        return gold.getQuantity();
    }

    public int getGemQuantity() {
        int sum = 0;
        for (Gem gem : gems) {
            sum += gem.getQuantity();
        }
        return sum;
    }

    public int getCashQuantity() {
        int sum = 0;
        for (Cash cash1 : cash) {
            sum += cash1.getQuantity();
        }
        return sum;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public List<Gem> getGems() {
        return gems;
    }

    public void setGems(List<Gem> gems) {
        this.gems = gems;
    }

    public List<Cash> getCash() {
        return cash;
    }

    public void setCash(List<Cash> cash) {
        this.cash = cash;
    }
}
