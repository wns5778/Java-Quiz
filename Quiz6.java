package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Quiz6 {
    public static void main(String[] args) {
        String name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        String[] nameAraay = name.split(",");

        String[] A;
        String B;

        int sum2 = 0;
        int KIM = 0;
        int LEE = 0;

        System.out.println(nameAraay[2]);



        //QUIZ 1. - 김씨와 이씨 성을 가진 사람의 수
        for (int i=0; i<68; i=i+4){
            if(name.charAt(i) == '김') {
                KIM += 1;
            }
            if(name.charAt(i) == '이') {
                LEE += 1;
            }
        }
        System.out.println("김씨 성을 가진 사람 수 : " + KIM);
        System.out.println("이씨 성을 가진 사람 수 : " + LEE);

        //QUIZ 2. - "이재영"이란 이름이 몇 번 반복되는가?

        int jaeyoung = 0;

        for (int i=0; i< nameAraay.length; i++){
            if(nameAraay[i].equals("이재영"))
                jaeyoung += 1;
        }

        System.out.println("동명이인 이재명의 수 : " + jaeyoung);


        //QUIZ 3. - 중복을 제거한 이름을 출력하세요

        ArrayList<String> arrayList = new ArrayList<>();
        //배열의 크기가 고정인 반면 ArrayList는 크기가 가변적으로 변함

        ArrayList<String> arrayList2 = new ArrayList<>();


        for (String item : nameAraay){
            if (!arrayList.contains(item))
                arrayList.add(item);//add() 함수를 이용해 리스트의 가장 끝에 값을 추가
            else
                arrayList2.add(item);
        }
        System.out.println(arrayList);


        //Quiz4. - 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요

        //List를 배열로 전환
        String[] array = new String[arrayList2.size()];
        int size = 0;
        for(String temp : arrayList2){
            array[size++] = temp;
        }

        System.out.println(arrayList2);

        //배열 오름차순
        Arrays.sort(array);
        for(String temp : array){
            System.out.println(temp);
        }



    }
}
