package Quiz;
//정보처리기사 합격 여부 프로그램

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("SW설계 : ");
        int test1 = sc.nextInt();

        System.out.print("SW개발 : ");
        int test2 = sc.nextInt();

        System.out.print("DB구축 : ");
        int test3 = sc.nextInt();

        System.out.print("프로그래밍 언어 활용 : ");
        int test4 = sc.nextInt();

        System.out.print("정보시스템 구축 관리 : ");
        int test5 = sc.nextInt();

        int sum = test1 + test2 + test3 + test4 + test5;
        int avg = sum/5;

        if(test1 < 40 || test2 < 40 ||test3 < 40 ||test4 < 40 ||test5 < 40)
            System.out.println("과락입니다.");
        else if(avg >= 60)
            System.out.println("합격입니다.");
        else
            System.out.println("불합격입니다.");

        }
    }

