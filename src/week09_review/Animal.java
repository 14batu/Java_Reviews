package week09_review;

public abstract class Animal {

    private String name;
    private int age;

    private final String breed;
    private final String gender;
    private final String color;

    public Animal(String name, int age, String breed, String gender, String color) {

        if(!(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))){
            throw new InvalidGenderException("can only be male or female");
        }

        setName(name);
        setAge(age);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new InvalidNameException("cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new InvalidAgeException("Age cannot be negative");
        }
        this.age = age;
    }

    public abstract void eat();
    public final void drink(){
        System.out.println(name + "is drinking water");
    }
    public abstract void sleep();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
