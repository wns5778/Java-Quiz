package Quiz;
//놀이공원 키제한 탑승 여부

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        System.out.print("키를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();

        String resutl = (height >= 120.0) ? "탑승 가능합니다" : "탑승 불가능합니다.";

        System.out.println("키가 " + height + "이여서 " + resutl);
    }

}
