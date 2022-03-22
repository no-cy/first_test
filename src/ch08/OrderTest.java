package ch08;
import java.util.Scanner;

public class OrderTest {
    public static void main(String[] argv) {

        PersonInfo Person = new PersonInfo(180, 78, "Tomas", 37);
        OrderList order = new OrderList();
        Scanner sc = new Scanner(System.in);

        order.orderNumber = "202011020003";
        System.out.println("핸드폰 번호를 입력하세요.");
        order.orderPhoneNumber = sc.next();
        System.out.println("집 주소를 입력하세요.");
        order.orderAddress = sc.nextLine();
        order.orderAddress = sc.nextLine();
        order.orderDate = "20201102";
        order.orderTime = "130258";
        order.orderPrice = "35000";
        order.menuNumber = "0003";

        System.out.println(Person.showCustomerInfo());

        order.showOrderList();
    }
}
