package ch08;

public class OrderList {
    public String orderNumber;
    public String orderPhoneNumber;
    public String orderAddress;
    public String orderDate;
    public String orderTime;
    public String orderPrice;
    public String menuNumber;

    public OrderList() {};

    public void showOrderList() {
        System.out.println("주문 접수 번호 : " + this.orderNumber);
        System.out.println("주문 핸드폰 번호 : " + this.orderPhoneNumber);
        System.out.println("주문 집 주소 : " + this.orderAddress);
        System.out.println("주문 날짜 : " + this.orderDate);
        System.out.println("주문 시간 : " + this.orderTime);
        System.out.println("주문 가격 : " + this.orderPrice);
        System.out.println("메뉴 번호 : " + this.menuNumber);
    }

}
