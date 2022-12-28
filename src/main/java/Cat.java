public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
        location = "Россия";
        food = "рыба";
        foodCounter = 10;
        counter = 12;
        health = HealthState.HEALTHY;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук: Мяу");
    }

    @Override
    public void eat() {
        if (foodCounter == 0) {
            System.out.println("Еды не осталось");
            return;
        }

        System.out.println("Ест. Еда:" + food + " Было рыб:" + foodCounter);
        foodCounter--;
        System.out.println("Осталось рыб:" + foodCounter);

    }

    @Override
    public String toString() {
        return "Кличка: " + name + " Страна обитания: " + location + " Состояние здоровья: " + health + " Сколько особей: " + counter;
    }
}

