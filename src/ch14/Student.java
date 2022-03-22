package ch14;
// James 와 Tomas 는 각각 버스와 지하철을 타고 학교에 갑니다.
// James 는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
// Tomas 는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.

//두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.

public class Student {

    String name;
    int money;

    public Student() {
        this("이름 없음", 0);
    }

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void getMoney() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }

    public static void main(String[] args) {
        Student student1 = new Student("James", 5000);
        Student student2 = new Student("Tomas", 10000);

        Bus bus = new Bus(student1);
        Subway subway = new Subway();

        bus.busBoard();
        subway.subwayBoard(student2);

        student1.getMoney();
        student2.getMoney();
        bus.showBusInfo();
        subway.showSubwayInfo();
    }
}
