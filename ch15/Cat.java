package gr.aueb.cf.exercises.ch15;

public class Cat extends Animal{

    public Cat () {}

    public Cat(String name, int age, String name1) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }

    @Override
    public String speak() {
        return "I am a cat";
    }

}
