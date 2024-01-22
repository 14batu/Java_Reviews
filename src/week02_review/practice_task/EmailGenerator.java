package week02_review.practice_task;

public class EmailGenerator {

    public static void main(String[] args) {

        String firstName = "Daniel";
        int birthYear = 1985;

        String emailPattern = firstName + "_" + birthYear; // it's combining first name with underscore and birth year

        String yahoo = emailPattern + "@yahoo.com"; // it's combining first name with underscore and birth year and @yahoo.com"
        String gmail = emailPattern + "@gmail.com"; // it's combining first name with underscore and birth year and @gmail.com"
        String outlook = emailPattern + "@outlook.com"; // it's combining first name with underscore and birth year and @outlook.com"
        String hotmail = emailPattern + "@hotmail.com"; // it's combining first name with underscore and birth year and @hotmail.com"
        String icloud = emailPattern + "@icloud.com"; // it's combining first name with underscore and birth year and @icould.com"

        System.out.println("yahoo: " + yahoo);
        System.out.println("gmail: " + gmail);
        System.out.println("hotmail: " + hotmail);
        System.out.println("outlook: " + outlook);
        System.out.println("icloud: " + icloud);

    }

}
/*
2. Create a class named EmailGenerator.

		Given the following variables:
		   - firstName
		   - birthYear

		 The program should generate emails for Gmail, Yahoo, and Outlook by combining the firstName with
		 an underscore and birthYear, followed by the domain of the email.

		 Example:
		   firstName = "Daniel"
		   birthYear = 1985

		 Output:
		   Your generated emails are:
		      Yahoo: Daniel_1985@yahoo.com
		      Gmail: Daniel_1985@gmail.com
		      Outlook: Daniel_1985@outlook.com
 */