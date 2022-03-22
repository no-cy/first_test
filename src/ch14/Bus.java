package ch14;

// 100번 버스의 승객은 1명 이고, 수입은 1000원 입니다.

public class Bus {

    int number;
    int fare;
    int passenger_cnt;
    int income;

    Student student;

    public Bus(Student student) {
        this(100, 1000, student);

    }

    public Bus(int number, int fare, Student student) {
        this.fare = fare;
        this.number = number;
        this.student = student;
    }

    public void busBoard() {
        busPay();
        busIncome();
        passenger_cnt++;
    }

    public void busIncome() {
        income += fare;
    }

    public int busPay() {
       return this.student.money -= fare;
    }

    public void showBusInfo() {
        System.out.println(number + "번 버스의 승객은 " + passenger_cnt + "명 이고, 수입은 " + income + "원 입니다.");
    }

}
