package week09_review;

public class Lion extends Animal implements WildAnimal{
    public Lion(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating lion food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is eating lion food");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}
