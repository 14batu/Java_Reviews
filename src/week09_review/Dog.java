package week09_review;

public class Dog extends Animal implements Playable{

    public Dog(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " dog is sleeping");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
