package Quiz;
//입력한 수가 완전수인지 여부와 완전수면 약수 구하기
//완전수 -> 자기 자신을 제외한 모두 약수의 합이 자기자신 ex) 28

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");

        List<Integer> L1 = new ArrayList<>();

        int number = sc.nextInt();
        int sum = 0;


        for (int i=1;i<number;i++) {
            if (number % i == 0) {
                L1.add(i);
            }
        }

        for (int data:L1) {
            sum += data;
        }

        if (sum == number) {
            System.out.print("완전수 " + number + "의 약수는 : ");
            for (int data : L1) {
                System.out.print(data + "\t");
            }
            System.out.println();
            System.out.println("약수의 합은 "+sum);
        }
        else
            System.out.println(number+"은 완전수가 아닙니다.");

    }
}
