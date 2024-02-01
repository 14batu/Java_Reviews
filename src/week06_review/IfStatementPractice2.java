package week06_review;

public class IfStatementPractice2 {

    public static void main(String[] args) {

        int a = 25,
                b = 10,
                c = 20;

        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
         /*
        in order for a to be the median in three different numbers:
                1. if c is the maximum number & b is the minimum number, then a is the median number
                2. if b is the maximum number & c is the minimum number, then a is the median number
        */

        boolean bIsMedian = (a > b && b > c) || (c > b && b > a);
         /*
        in order for b to be the median number in three different numbers:
                1. if a is the maximum number & c is the minimum number, then a is the median number
                2. if c is the maximum number & a is the minimum number, then a is the median number
        */


        boolean cIsMedian = (a > c && c > b) || (b > c && c > a);

         /*
        in order for c to be the median number in three different numbers:
                1. if a is the maximum number & b is the minimum number, then c is the median number
                2. if b is the maximum number & a is the minimum number, then c is the median number
        */

       // boolean bIsMedian = !aIsMedian && !cIsMedian;
        //System.out.println("aIsMedian = " + aIsMedian);
       // System.out.println("bIsMedian = " + bIsMedian);



        if(aIsMedian){ // if A is the median number between those three different numbers

            System.out.println(a + " is the median number");

        }else if(bIsMedian){ // if B is the median number between those three different numbers

            System.out.println(b + " is the median number");

        }else{ // Otherwise: if C is the median number between those three different numbers
            System.out.println(c + " is the median number");
        }



    }

}

/*
2. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */