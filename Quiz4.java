package Quiz;
//1 -2 +3 -4 ... -99 +100 을 출력 후 합계를 구하시오
public class Quiz4 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        for(int i=1, j=-2;i<100; i=i+2, j=j-2) {
            System.out.print(i + " " +j + " ");
            sum = sum + i + j;
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
