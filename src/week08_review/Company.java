package week08_review;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private String location;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String companyName, String location) {
        setCompanyName(companyName);
        setLocation(location);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void hireEmployee(Employee employee){
        if(employee == null){
            System.err.println("Employee cannot be null");
            System.exit(1);
        }
        employees.add(employee);
    }

    public void hireEmployee(Employee[] employees){

        for (Employee each : employees) {
            hireEmployee(each);
        }

    }

    public void fireEmployee(String id){
        employees.removeIf(p -> p.getEmployeeId().equalsIgnoreCase(id));
    }
    public void displayEmployeesInfo(){
        System.out.println("Company: " + companyName);
        for (Employee eachEmployee : employees) {
            System.out.println("------------------");
            eachEmployee.toString();
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", employees=" + employees.size() +
                '}';
    }
}
