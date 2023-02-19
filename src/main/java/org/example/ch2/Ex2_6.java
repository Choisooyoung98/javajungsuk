package org.example.ch2;

/*
2-6 리터럴의 접두사와 접미사
정수형 접미사 L(long) ex) 100L - long type
실수형 f(float), d(double, d는 생략가능)

2-7 변수와 리터럴의 타입 불일치
    범위가 '변수 > 리터럴' 인 경우 가능
    범위가 '변수 < 리터럴' 인 경우 불가능, 강제 형변환 필요
    byte, short 변수에 int 리터럴 저장 가능(변수의 타입의 범위 이내이어야 함)
*/
public class Ex2_6 {
    public static void main(String[] args) {
        boolean power = true;
        char ch = 'A';
        String str = "ABC";
        byte b = 127; // int 타입
        // byte b = 128; 에러
        int i = 100; // 10진수
        int oct = 0100; // 8진수
        int hex = 0x100; // 16진수
        long l = 10_000_000_000L; // 100억까지 큰 숫자를 표시할때 '_' 를 넣는다.
        long l2 = 100; // L은 생각가능
        float f = 3.14f; // f 생략 불가능
        double d = 3.14d; // d 생략 가능
    }
}
