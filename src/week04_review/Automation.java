package week04_review;

public class Automation {
    public static void main(String[] args) {
        /*
        String url = "www.google.com";
        String browser = "chrome";

        System.out.println("Opening the " + browser + " browser .."); // ChromeDriver()
        System.out.println("Navigating to " + url); //navigate()

        System.out.println("Executing the test case 1");

        System.out.println("Getting the test result of test case 1");
        System.out.println("Closing the " + browser + " browser.");

         */
        String url = "www.google.com";
        String browser = "chrome";
        for (int i = 1; i <= 7; i++) {
            System.out.println("-------------- 30 sounds pause ---------------");
            System.out.println("Opening the " + browser + " browser .."); // ChromeDriver()
            System.out.println("Navigating to " + url); //navigate()

            System.out.println("Executing the test case " + i);

            System.out.println("Getting the test result of test case 1");
            System.out.println("Closing the " + browser + " browser.");

        }
    }
}
