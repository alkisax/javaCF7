package gr.aueb.cf.exercises.ch15;

public class Maini151 {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal("Generic", 5);
        System.out.println(genericAnimal);
        System.out.println("Animal speaks: " + genericAnimal.speak());

        // Create a Dog object
        Dog dog = new Dog("Buddy", 3, "Dog");
        System.out.println(dog);
        System.out.println("Dog speaks: " + dog.speak());

        // Create a Cat object
        Cat cat = new Cat("Whiskers", 2, "Cat");
        System.out.println(cat);
        System.out.println("Cat speaks: " + cat.speak());

        System.out.println("polymorfism");
        doSpeak(dog);
        doSpeak(cat);

    }

    public static void doSpeak (Animal animal){
        System.out.println(animal.speak());
    }
}
