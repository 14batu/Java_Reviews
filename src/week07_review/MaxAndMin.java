package week07_review;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] num = {10,5,20,30,3,40,5};

        int max = num[0];
        int min = num[0];

        for (int each : num) {
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);
        for (int each : num) {
            if (each < max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
