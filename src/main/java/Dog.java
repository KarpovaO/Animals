public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        location = "Австрия";
        food = "мясо";
        foodCounter = 120;
        counter = 16;
        health = HealthState.HEALTHY;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук: Гав");
    }

    @Override
    public void eat() {
        if (foodCounter == 0) {
            System.out.println("Еды не осталось");
            return;
        }

        System.out.println("Ест. Еда:" + food + " Было мяса:" + foodCounter);
        foodCounter--;
        System.out.println("Осталось мяса:" + foodCounter);

    }

    @Override
    public String toString() {
        return "Кличка: " + name + " Страна обитания: " + location + " Состояние здоровья: " + health + " Сколько особей: " + counter;
    }
}
