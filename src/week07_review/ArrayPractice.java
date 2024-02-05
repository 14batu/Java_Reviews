package week07_review;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        for (int each : numbers) {
            System.out.println(each);
        }



    }
}
