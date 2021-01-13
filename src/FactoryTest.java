public class FactoryTest {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("canine");
        System.out.println("animal 1 sound "+ animal1.makeSound());
        Animal animal2 = animalFactory.getAnimal("feline");
        System.out.println("animal 2 sound "+ animal2.makeSound());
    }
}
