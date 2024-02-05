package week07_review;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        String[] names = {"Dina","Emrah","Semen","Batuhan"};

        String[] reversed = new String[names.length];

        for (int i = names.length - 1,j = 0; i >= 0; i--, j++) {
            reversed[j] = names[i];

        }
        System.out.println(Arrays.toString(reversed));


    }
}
