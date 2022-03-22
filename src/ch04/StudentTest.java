package ch04;

public class StudentTest {

    public static void main(String[] args) {
        // 참조 변수 = heap 영역에 생성 된 인스턴스를 가르키는 변수.
        // heap 영역에 생성. = 생성자
        Student studentNo = new Student(); // 인스턴스 생성

        studentNo.studentID = 12345;
        studentNo.setStudentName("No Chan Young");
        studentNo.address = "서울 금천구";

        studentNo.showStudentInfo();

        Student studentPark = new Student();

        studentPark.studentID = 67890;
        studentPark.setStudentName("Park Su Min");
        studentPark.address = "서울 금천구";

        studentPark.showStudentInfo();

        System.out.println(studentNo); // 패키지, 클래스, 주소 출력
        System.out.println(studentPark);
    }
}
