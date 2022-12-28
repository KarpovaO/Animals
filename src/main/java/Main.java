public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Cat("Барсик"), new Horse("ЗавХоз"), new Dog("Снежок")};
        for (Animal animal : animals) {
            System.out.println(animal);
            animalInfo(animal);
        }

    }

    public static void animalInfo(Animal animals) {
        Vet vet = new Vet("Айболит");
        animals.makeSound();
        animals.eat();
        vet.treatAnimal(animals);
        animals.sleep();
        System.out.println("-----------------------------");
    }
}









