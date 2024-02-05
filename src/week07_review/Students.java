package week07_review;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
        String [][] groups = {{"Ayat","Kiara","Batu"},{"Maksym","Samirea","Rabee","Dmitry","Semen"},{"Jila","Emir","Aysun"}};

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudents : eachGroup) {
                System.out.println(eachStudents);
            }
        }
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                groups[i][j] = groups[i][j].toUpperCase();
            }
        }
        System.out.println(Arrays.deepToString(groups));
    }
}
