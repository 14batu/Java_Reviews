package week05_review;
import java.util.Scanner;

public class PizzaOrderApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\tWelcome to Cydeo Pizza House\n\nWould you like to order a pizza? (Yes/No)");
        String answer = scanner.nextLine().toLowerCase();

        //step 1

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter ...");
            answer = scanner.nextLine().toLowerCase();
        }

        if (answer.equals("no")){
            System.out.println("Thanks for using our service!");
            return; // exit the main method
        }

        //step 2

        System.out.println("Enter the size of the pizza (small, medium, large)");
        String size = scanner.next().toLowerCase();

        scanner.nextLine();

        while (!(size.equals("small") || size.equals("medium") || size.equals("large"))){
            System.err.println("Invalid entry, please re-entry the size of pizza (small, medium, large ");
            size = scanner.nextLine().toLowerCase();
        }

        //step 3
        System.out.println("Enter the number of cheese toppings: (0-10)");
        int cheeseTopping = scanner.nextInt();

        while (cheeseTopping < 0 || cheeseTopping > 10){
            System.err.println("Invalid entry, please re-enter cheese topping (0-10)");
            cheeseTopping = scanner.nextInt();
        }

        System.out.println("Enter the number of pepperoni toppings: (0-20)");
        int pepperoniTopping = scanner.nextInt();

        while (pepperoniTopping < 0 || pepperoniTopping > 10){
            System.err.println("Invalid entry, please re-enter cheese topping (0-10)");
            pepperoniTopping = scanner.nextInt();
        }

        //step 4

        System.out.println("Enter the quantity ?");
        int quantity = scanner.nextInt();

        while (quantity <= 0 || quantity > 100) {
            System.err.println("Invalid entry, please re-enter quantity: (1 - 100)");
            quantity = scanner.nextInt();
        }

        //step 5

        Pizza pizza = new Pizza();

        pizza.setInfo(size,quantity,pepperoniTopping,pepperoniTopping);
        System.out.println("Your total is : + $" + pizza.calcCost());

        scanner.close();












    }
}
/*
Create a class named `PizzaOrderApp` and write a program for pizza ordering applications with the following requirements:

    1. Display the following welcome message and ask the user if they want to order a pizza:

                    Welcome to Cydeo Pizza House

                Would you like to order a pizza?

            If they say "yes," proceed to the next step.

            If they say "no," display "Thanks for using our service!".

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

    2. Ask the user to select the size of the pizza. If the user enters an invalid entry, then the application should ask the user to re-enter until the user provides a valid entry.

    3. Ask the user to enter the number of cheese toppings and pepperoni toppings. If any entry is invalid, then the application should ask the user to re-enter until the user provides a valid entry.

    4. Ask the user to enterr the quantity.

    5. The application should create the pizza object for the pizza that the user ordered and display the total price at the end.
 */
