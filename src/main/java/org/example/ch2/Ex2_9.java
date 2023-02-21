package org.example.ch2;

/*
2-9 두 변수의 값 교환하기
*/
public class Ex2_9 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp;
        tmp = x; // 1. x의 값을 tmp에 저장
        x = y; // 2. y의 값을 x에 저장
        y = tmp; // 3. tmp의 값을 y의 저장
        System.out.println(x + ", " + y);
    }
}
