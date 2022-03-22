package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentNo = new Student(100, "노찬영");
        studentNo.setKoreaSubject("국어", 100);
        studentNo.setMathSubject("수학", 20);

        Student studentPark = new Student(101, "박수민");
        studentPark.setKoreaSubject("국어", 100);
        studentPark.setMathSubject("수학", 100);

        studentNo.showScoreInfo();
        studentPark.showScoreInfo();
    }
}
