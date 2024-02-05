package week07_review;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(Arrays.asList(60,70,80));

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);

//        for (Integer each : arrayList1) {
//            arrayList3.add(each);
//        }

        System.out.println(arrayList3);


    }
}
