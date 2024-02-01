package week06_review;

public class IfStatementPractice1 {

    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0) { // if the number is evenly divisible by 3 and 5 BOTH

            System.out.println("FINRA");

        } else if (num % 5 == 0) { // if the number is evenly divisible by 5 ONLY

            System.out.println("RA");

        } else if (num % 3 == 0) { // if the number is evenly divisible by 3 ONLY

            System.out.println("FIN");

        } else { // otherwise: If the number is not evenly divible by 3 or 5
            System.out.println(num);
        }


    }

}

/*
3. Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
 */