package week03_review;

public class MovieTicketBooking {
    public static void main(String[] args) {


        int age = 35;
        String ageGroup;


        if (age <= 0 || age >= 110) {
            System.err.println("Invalid age");
            System.exit(1);
        }

        if (age >= 0 && age <= 2) {
            ageGroup = "Infant";
        } else if (age >= 3 && age <= 12) {
            ageGroup = "Kid";
        } else if (age >= 13 && age <= 20) {
            ageGroup = "Teenager";
        } else if (age >= 21 && age <= 64) {
            ageGroup = "Adult";
        } else {
            ageGroup = "Senior";
        }

        switch (ageGroup) {
            case "Infant":
                System.out.println("Free ticket for infants");
                break;
            case "Kid", "Teenager":
                System.out.println("The ticket price for your age is : $8 ");
                break;
            case "Adult":
                System.out.println("The ticket price your age is : $12");
                break;
            case "Senior":
                System.out.println("The ticket price your age is : $10");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
