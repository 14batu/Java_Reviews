package week03_review;

public class BMICalculator {
    public static void main(String[] args) {

        double height = 1.85;
        double weight = -80.5;

        if (height <= 0 || weight <= 0 ){
            System.err.println("Height or the weight can not be zero or negative");
            System.exit(1);
        }

        String category;

        int bmi = (int)(weight / (height * height));

        System.out.println("Your body Mass index (BMI): " + bmi);

        if (bmi < 18.5) {
            category = "Under Weight";
        } else if (bmi <= 18.5 && bmi < 25) {
            category = " Normal Weight";
        } else if (bmi <= 25 && bmi < 30) {
            category = "OverWeight";
        } else {
            category = "Obesity";
        }
        System.out.println("Category : " + category);
        switch (category) {
            case "OverWeight", "Obesity":
                System.out.println("Stick with your diet");
                break;
        }

    }
}
/*
1. Create a Java class named BMICalculator with the following requirements:

    1.1 Define two variables within the class:
            height: Represents the user's height in meters.
            weight: Represents the user's weight in kilograms.

    1.2 Write a program that calculates the user's Body Mass Index (BMI) using the formula:

            BMI = weight / (height * height)

    1.3 Determine the BMI category based on the calculated BMI using the following criteria:

            Underweight: BMI < 18.5
            Normal Weight: 18.5 <= BMI < 25
            Overweight: 25 <= BMI < 30
            Obesity: BMI >= 30

    1.4 Display the calculated BMI and BMI category in the following format:

            Example:
                height = 1.75
                weight = 73.5

            Output:
                Your Body Mass Index (BMI): 24.0
                Category: Normal Weight


    Ensure that the program provides accurate BMI calculations and clearly communicates the user's BMI category based
     on the specified criteria.
 */