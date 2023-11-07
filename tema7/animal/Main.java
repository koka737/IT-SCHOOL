package tema7.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println("Calling makeSound() on a generic animal:");
        animal.makeSound();

        System.out.println("Calling makeSound() on a dog:");
        dog.makeSound();
    }
}
