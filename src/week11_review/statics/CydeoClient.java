package week11_review.statics;

public class CydeoClient {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("John", 25, 123, 'A', 7, 3);
        CydeoStudent student2 = new CydeoStudent("Jane", 23, 124, 'B', 7, 3);
        CydeoStudent student3 = new CydeoStudent("Jack", 24, 125, 'C', 7, 3);
        CydeoStudent student4 = new CydeoStudent("Jill", 26, 126, 'D', 7, 3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        student1.study();
        student2.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
    }
}
