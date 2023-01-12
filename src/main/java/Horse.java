public class Horse extends Animal {
    public Horse(String name, String location, String food, int foodCounter, HealthState health) {
        this.name = name;
        this.location = location;
        this.food = food;
        this.foodCounter = foodCounter;
        this.health = health;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук: Иго-го");
    }


}
