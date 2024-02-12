package week08_review;

import java.util.ArrayList;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String employeeId, double salary, String programmingLanguage) {
        super(name, age, gender, employeeId, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        String [] languages = {"Java","Python","C++","Swift","C#"};
        boolean contains = false;
        for (String each : languages) {
            if (each.equalsIgnoreCase(programmingLanguage)){
                contains = true;
                break;
            }
        }

        if(contains){
            this.programmingLanguage = programmingLanguage;

        }else {

            /*
            System.err.println("Invalid programming language " + programmingLanguage);
            System.exit(1);

             */

            throw new RuntimeException("Invalid programming language " + programmingLanguage);
        }



    }
    @Override
    public void work(){
        System.out.println(getName() + " is developing");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
