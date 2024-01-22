package week04_review;

public class Operators {

    public static void main(String[] args) {


        System.out.println( 25 % 6);

        System.out.println(25 % 5);

        int number = 500;

        System.out.println(number++); // 500
        System.out.println(number); // 501

        System.out.println(++number); //502

        int index = 0;

        System.out.println(index++);

       // System.out.println("235" > 10);

        int age = 21;

        System.out.println(age > 21); // excludes 21

        System.out.println(age >= 21); // includes 21

        System.out.println("------------------------------------------");

        boolean username = false;
        boolean email = false;
        boolean password = true;

        System.out.println(email && password);

        System.out.println(username && password);

        System.out.println(username || email); // username or email


        System.out.println(false & true); // false
        //                  false & true ====> false

        System.out.println(false && true);
        //                 false &&     ===> false


        System.out.println(true && true);
        //                 true && true ===> true

        System.out.println(true || true);
        //                 true ||     ===> true

        System.out.println(false || true);
        //                 false || true  ===> true


        // number is between 90 to 100 : 90 <= num <= 100

        int num = 80;

        // System.out.println(90 <= num <= 100);

        System.out.println( 90 <= num && num <= 100);
        //                   false    ||    true ===> true


    }

}
