public class Vet {
    String name;

    public Vet(String name) {
        this.name = name;
    }

    void treatAnimal(Animal animal) {
        System.out.println("Приём ветеринара:" + name + " обследуемый:" + animal.name);
        if (animal.health == HealthState.HEALTHY) {
            System.out.println("Животное здорово");
        } else {
            System.out.println("Животное вылечили");
        }


    }

}