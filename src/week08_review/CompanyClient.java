package week08_review;

public class CompanyClient {
    public static void main(String[] args) {
        Company company = new Company("Ankara","USA");

        Employee employee =new Employee("Yezid",30,'M',"A101",100_000);
        Employee employee2 =new Employee("Ergin",30,'M',"A102",100_000);

        Employee[] employees = {
                new Employee("Samira", 35, 'F', "A03", 115_000),
                new Employee("Samen", 40, 'M', "A04", 120_000),
                new Employee("Maksym", 25, 'F', "A05", 95_000)
        };

        company.hireEmployee(employees);





        company.hireEmployee(employee);
        company.hireEmployee(employee2);
        company.fireEmployee("A101");

        System.out.println(company);

        company.displayEmployeesInfo();


    }
}
