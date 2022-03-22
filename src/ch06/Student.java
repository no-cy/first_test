package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    // 생성자 오버로딩.
    public Student() {}
    public Student(int studentNumber, String studentName, int grade) {
        //this 자기 자신의 멤버 변수를 가르키는 명령어.
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + " 학생의 학번은 " + studentNumber + " 이고, " + grade + "학년 입니다";
    }
}
