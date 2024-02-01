package week06_review;

public class SwitchStatement2{

    public static void main(String[] args) {

        String browser = "cydeo";

        switch (browser.toLowerCase()){
            case "chrome" -> {
                System.out.println("Opening the chrome browser...");
            }

            case "firefox" -> System.out.println("Opening the firefox browser...");

            case "safari" -> System.out.println("Opening the safari browser...");

            case "edge" -> System.out.println("Opening the edge browser...");

            case "opera" -> System.out.println("Opening the opera browser...");

            default -> System.out.println("Invalid browser is selected");

        }

    }

}
