package week08_review;

import com.sun.security.jgss.GSSUtil;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int age, char gender, String employeeId, double salary, String department) {
        super(name, age, gender, employeeId, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing " + department);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "department='" + department + '\'' +
                '}';
    }
}
