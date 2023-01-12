public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]
                {new Cat("Барсик", "Россия", "Рыба", 15, HealthState.HEALTHY),
                        new Horse("ЗавХоз", "Москва", "Сено", 0, HealthState.UNHEALTHY),
                        new Dog("Бёрн", "Непал", "Мясо", 26, HealthState.HEALTHY)};

        for (Animal animal : animals) {
            System.out.println(animal);
            if (animal instanceof Cat | animal instanceof Horse) {
                animal.eat();
                animal.sleep();
            }
            animalInfo(animal);

        }

    }

    public static void animalInfo(Animal animals) {
        Vet vet = new Vet("Айболит");
        animals.makeSound();
        vet.treatAnimal(animals);
        System.out.println("-----------------------------");
    }
}







