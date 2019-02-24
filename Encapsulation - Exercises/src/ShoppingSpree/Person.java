package ShoppingSpree;

import java.util.ArrayList;

public class Person {

    private String name;
    private int money;
    private ArrayList<Product> products;


    public Person(String name, int money) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be an empty string.");
        } else {
            if (money < 0) {
                throw new IllegalArgumentException("Money cannot be a negative number.");
            } else {
                this.money = money;
                this.name = name;
                this.products = new ArrayList<>();
            }
        }
    }

    public void printProducts() {
        if (this.getProducts().size() == 0) {
            System.out.print("Nothing bought");
        } else {
            int i = 1;
            for (Product product : products) {
                if (i == products.size()) {
                    System.out.print(product.getName());
                } else {
                    System.out.print(product.getName() + ", ");
                }
                i += 1;
            }
        }
    }

    public boolean hasEnoughMoney(int money) {
        return this.money >= money;
    }

    public void subtractMoney(int money) {
        this.money -= money;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
