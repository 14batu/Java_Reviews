package week11_review.encapsulation;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private String name;
    private int age;
    private String jobTitle;
    private char gender;
    private boolean isFullTime;
    private double salary;
    private String companyName;
    private int employeeID;
    private double hourlyRate;



    public Employee(String name, int age, String jobTitle, char gender, boolean isFullTime, double salary, String companyName, int employeeID, double hourlyRate) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setGender(gender);
        setFullTime(isFullTime);
        setSalary(salary);
        setCompanyName(companyName);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
    }

    public void work() {
        System.out.println("Employee is working");
    }

}
