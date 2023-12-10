package Quiz;
//1부터 입력받은 수까지의 약수를 구하기

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구하고 싶은 약수를 입력하시오 : ");

        int num = sc.nextInt();
        System.out.println();

        for(int i = 1; i<=num; i++){
            System.out.print(i+" : ");
            for(int j =1; j<=i; j++){
                if (i%j == 0)
                    System.out.print(j+" ");
            }
            System.out.println();


        }
    }
}
