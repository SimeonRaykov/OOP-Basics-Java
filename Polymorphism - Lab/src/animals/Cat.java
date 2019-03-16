package animals;

public class Cat extends Animal {
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am "+this.getName()+" and my favourite food is "+this.getFavouriteFood()+System.lineSeparator()+"MEEOW";
    }
}
