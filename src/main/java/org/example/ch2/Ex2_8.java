package org.example.ch2;

/*
2-8 문자와 문자열
*/
public class Ex2_8 {
    public static void main(String[] args) {
        char ch = 'A';
        String s = "ABC"; // 문자열 String 클래스
        String s2 = new String("AB"); // 잘 쓰지않는다.
        String s3 = ""; // 빈 문자열
        // char ch = ''; // 에러
        String s4 = "" + 7; // 숫자 -> 문자열로 변환
        String s5 = "" + 7 + 7; // -> 77
        String s6 = 7 + 7 + ""; // -> 14
        System.out.println(s6);
    }
}
