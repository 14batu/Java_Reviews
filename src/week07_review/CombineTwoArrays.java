package week07_review;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40};
        int[] arr2 = {40,50,60};

        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;

        for (int each : arr1) {
            arr3[j++] = each;
        }

        for (int each : arr2) {
            arr3[j++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
