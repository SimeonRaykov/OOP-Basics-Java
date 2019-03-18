package wildFarm.models.animals;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;

    }

    public abstract void printAnimal();

    @Override
    public void makeSound() {

    }

    @Override
    public void eatFood() {

    }

    public String getLivingRegion() {
        return livingRegion;
    }
}
