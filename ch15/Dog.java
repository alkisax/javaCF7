package gr.aueb.cf.exercises.ch15;

public class Dog extends Animal{

    public Dog () {}

    public Dog(String name, int age, String name1) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }

    @Override
    public String speak() {
        return "I am a dog";
    }
}
