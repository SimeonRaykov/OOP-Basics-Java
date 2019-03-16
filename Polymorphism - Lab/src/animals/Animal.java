package animals;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public abstract String explainSelf();
}
