package week04_review;

public class DivisibleByTwo {
    public static void main(String[] args) {
        int number = 40;
        int count = 0;
        while (number % 2 == 0){

            count ++;
            number /= 2;
        }
        System.out.println("number = " + count);
    }
}
