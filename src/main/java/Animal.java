public abstract class Animal {
    protected String name; //кличка животного
    protected String food; //название типа пищи
    protected int foodCounter; //кол-во запасов пищи
    protected String location; //название страны обитания
    static int counter = 50; // все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во особей данного вида
    protected HealthState health; // состояние здоровья животного типа HealthState :Возможные значения HealthState HEALTHY, UNHEALTHY

    public abstract void makeSound();

    public void eat() {
        if (foodCounter <= 0) {
            System.out.println("Хотелось есть, но еды не осталось");
            return;
        }
        System.out.println("Ест. Еда:" + food + " Было:" + foodCounter);
        foodCounter--;
        System.out.println("Осталось:" + foodCounter);

    }

    public void sleep() {
        System.out.println("Спит: Zzzzz...");
    }

    public String toString() {
        return "Кличка: " + name + " Страна обитания:" + location + " Состояние здоровья: " + health + " Сколько особей:" + counter;
    }
}

