package Quiz;
//1~1000에서 각 숫자의 개수 구하기

import java.util.Arrays;
import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {

        System.out.println("1~1000의 숫자에서 각 숫자의 갯수는?");
       int box[] = new int[10];
       for(int i=1; i<=1000; i++){
           box[i%10]++;
           if(i>=10)
               box[i/10%10]++;
           if(i>=100)
               box[i/100%10]++;
           if(i==1000)
               box[1]++;
       }
       for (int i=0;i<=9;i++){
           System.out.println(i+"의 갯수 : "+box[i]);
       }
    }
}
