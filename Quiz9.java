package Quiz;
//0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.

import java.util.*;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number : ");
        String number = sc.next();

        int[] Array = new int[number.length()];
        int input;
        int flag =  0;
        int[] Array2 = new int[10];

        if (number.length() == 10) {
            for (int i = 0; i < number.length(); i++) {

                input = (int) number.charAt(i) - 48;//char -> int 형변환 시 Ascii코드값 48 빼주기
                if (Array2[input] != 0) {
                    System.out.println("false!!!");
                    flag = 1;
                    break;
                } else {
                    Array2[input] = input;
                }
            }
            if(flag == 0){
                System.out.println("ture!!!");
            }
        }
        else
            System.out.println("false!!!");

        System.out.print(Arrays.toString(Array2));

    }
}
