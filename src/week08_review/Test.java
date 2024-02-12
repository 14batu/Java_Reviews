package week08_review;

public class Test {
    public static void main(String[] args) {

        Person person = new Person("Batuhan",31,'M');
        Person person1 = new Person("Aysun",55,'F');

        System.out.println(person1);
        System.out.println(person);

        System.out.println(person1.getName());

        Employee employee = new Employee("Reis",23,'M',"1234",45_000);
        System.out.println(employee);

        employee.work();

        Developer developer = new Developer("Emir",22,'F',"123",56_000,"Java");
        System.out.println(developer);
        developer.work();

        Manager manager = new Manager("Selam",44,'M',"Asd",58_000,"IT");
        System.out.println(manager);
        manager.work();



    }
}
