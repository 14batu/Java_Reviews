package week08_review;

public class Person {

    private String name;

    private int age;
    private char gender;
    public final static boolean isHuman,canBreath;
    public final static int numberOfHeads;


    static {
        isHuman = true;
        canBreath = true;
        numberOfHeads = 1;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("name cannot be null");
            System.exit(1);
        }
        if(name.isBlank() || name.isEmpty()){
            System.err.println("name cannot be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 ){
            System.err.println("age cannot be less than 0");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F'){
            this.gender = gender;

        }else {
            System.err.println("Gender only be set to 'M' or 'F'");
            System.exit(1);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    //    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(String name, char gender) {
//        this(name);
//        this.gender = gender;
//    }
//
//    public Person(String name, int age, char gender) {
//        this(name,gender);
//        this.age = age;
//    }
}
