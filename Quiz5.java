package Quiz;
//1000미만의 숫자 중 3과 5의 배수 총합 구하기

public class Quiz5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<1000;i++){
            if (i%3==0 || i%5==0)
                sum = sum+i;
        }
        System.out.println("합계 = " + sum);
    }
}
