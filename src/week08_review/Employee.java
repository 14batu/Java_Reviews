package week08_review;

public class Employee extends Person{

    private String employeeId;
    private double salary;

    public Employee(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
