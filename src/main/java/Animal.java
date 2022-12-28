public abstract class Animal {
    protected String name; //кличка животного
    protected String food; //название типа пищи
    protected int foodCounter; //кол-во запасов пищи
    protected String location; //название страны обитания
    protected int counter; // все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во особей данного вида
    protected HealthState health; // состояние здоровья животного типа HealthState :Возможные значения HealthState HEALTHY, UNHEALTHY

    public abstract void makeSound();

    public abstract void eat();

    public void sleep() {
        System.out.println("Спит: Zzzzz...");
    }

    public String toString() {
        return "Кличка: " + name + "Страна обитания: " + location + "Состояние здоровья: " + health + "Сколько особей:" + counter;
    }
}

