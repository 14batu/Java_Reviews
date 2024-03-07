package week11_review.encapsulation;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "Software Developer", 'M', true, 100_000, "Google", 12345, 50);
        System.out.println(employee);
        employee.work();
    }
}
