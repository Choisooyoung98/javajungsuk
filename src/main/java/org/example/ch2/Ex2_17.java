package org.example.ch2;

/*
2-17 타입간의 변환방법
1. 문자와 숫자간의 변환 //숫자 + ' ', 숫자 - ' '
2. 문자열로의 변환 //숫자 + ""
3. 문자열을 숫자로 변환 Integer.parseInt("숫자")
* */
public class Ex2_17 {
    public static void main(String[] args) {
        String str = "3";
        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
        System.out.println(Integer.parseInt(str) + 1);
        System.out.println("3" + 1);
        System.out.println(3 + '0');

    }
}
