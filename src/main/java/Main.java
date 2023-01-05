public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Cat("Барсик"), new Horse("ЗавХоз"), new Dog("Снежок")};
        for (Animal animal : animals) {
            if(animal instanceof Cat |animal instanceof Horse ){
                System.out.println(animal);
                animal.eat();
                animal.sleep();

            }

            animalInfo(animal);
        }

    }

    public static void animalInfo(Animal animals) {
        Vet vet = new Vet("Айболит");
        animals.makeSound();
//        animals.eat();
        vet.treatAnimal(animals);
//        animals.sleep();
        System.out.println("-----------------------------");
    }
}







