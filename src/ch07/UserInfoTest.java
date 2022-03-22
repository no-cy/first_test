package ch07;

public class UserInfoTest {
    public static void main(String[] args) {

        UserInfo userNO = new UserInfo();
        userNO.userId = "a12345";
        userNO.userPassWord = "qkraldRn";
        userNO.userName = "노찬영";
        userNO.phoneNumber = "010838736368";
        userNO.userAddress = "서울 금천구";

        System.out.println(userNO.showUserInfo());

        UserInfo userPark = new UserInfo("b12345", "shWksod", "박수민");
        System.out.println(userPark.showUserInfo());
    }
}
