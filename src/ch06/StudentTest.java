package ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentNo = new Student(12345, "노찬영", 28);
        Student studentPark = new Student(67890, "박수민", 26);
        Student studentSin = new Student();

        System.out.println(studentNo.showStudentInfo());
        System.out.println(studentPark.showStudentInfo());
        System.out.println(studentSin.showStudentInfo());
    }
}
