package org.example.ch2;

import java.util.Scanner;

/*
2-14 화면에서 입력받기 - Scanner
Scanner란?
- 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
Scanner를 사용하려면
- import문 추가 - import java.util.*
- Scanner객체의 생성 - Scanner s = new Scanner(System.in);
- Scanner객체를 사용 - int num = s.nextInt(); String input = s.nextLine();
*/
public class Ex2_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        int num = Integer.parseInt(input);
        System.out.println(num);
    }
}
