package org.example.ch2;

/*
변수(Variable)란
하나의 값을 저장할 수 있는 메모리 공간
-> RAM 하나의 연속된 저장공간
1byte 단위로 나누고 각각의 저장공간에 메모리 주소가 있다.
메모리 주소에 이름을 붙이고
이름을 이용해서 메모리의 값을 저장하고 읽을 수 있게 하는것이 변수이다.
변수는 단 하나의 값만 저장할 수 있고 새로운 값을 저장하면 기존에 값을 지워지고 새로 저장한 값만 남는다.

변수의 선언
1. 변수의 선언 이유
    값을 저장할 공간을 마련하기 위해서
2. 변수의 선언 방법
    변수타입 변수이름;
3. 변수에 값 저장하기
    int age; //정수(int)타입의 변수 age를 선언
    age = 25; //변수 age에 25를 저장, '=' 는 등호가 아니라 대입
    변수의 초기화 - 변수에 처음으로 값을 저장하는 것
    int x = 0, y = 5; // 지역변수는 0으로 자동 초기화 되지 않기때문에 초기화를 해줘야된다.
4. 변수의 값 읽어오기
    변수의 값이 필요한 곳에 변수의 이름을 적는다.
*/
public class Ex2_3 {
    public static void main(String[] args) {
        int age = 26;
        System.out.println(age);
    }
}
