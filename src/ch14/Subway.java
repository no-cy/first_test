package ch14;

//2번 지하철의 승객은 1명이고, 수입은 1200원 입니다.
public class Subway {
    String color;
    int number;
    int fare;
    int passenger_cnt;
    int income;

    public Subway() {
        this("green", 2, 1200);
    }

    public Subway(String color, int number, int fare) {
        this.color = color;
        this.fare = fare;
        this.number = number;
    }

    public int subwayPay(Student student) {
       return student.money -= fare;
    }

    public void subwayBoard(Student student) {
        subwayPay(student);
        busIncome();
        passenger_cnt++;
    }

    public void busIncome() {
        income += fare;
    }

    public void showSubwayInfo() {
        System.out.println(number + "번 지하철의 승객은 " + passenger_cnt + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
