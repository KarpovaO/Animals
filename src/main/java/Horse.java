public class Horse extends Animal {

    public Horse(String name) {
        this.name = name;
        location = "Израиль";
        food = "сено";
        foodCounter = 0;
        counter = 27;
        health = HealthState.UNHEALTHY;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук: Иго-го");
    }

    @Override
    public void eat() {
        if (foodCounter == 0) {
            System.out.println("Еды не осталось");
            return;
        }

        System.out.println("Ест. Еда:" + food + " Было сена:" + foodCounter);
        foodCounter--;
        System.out.println("Осталось сена:" + foodCounter);

    }


    @Override
    public String toString() {
        return "Кличка: " + name + " Страна обитания: " + location + " Состояние здоровья: " + health + " Сколько особей: " + counter;
    }
}
