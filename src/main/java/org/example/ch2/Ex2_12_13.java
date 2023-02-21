package org.example.ch2;

/*
2-12, 13 printf를 이용한 출력
println 의 단점 - 출력형식 지정불가
printf로 출력형식 지정 가능
ex) System.out.printf("%.2f", 10.0/3); // 3.33
지시자
%전체자리.소수점아래자리f ex) %14.10f // 전체 14자리 중 소수점 아래 10자리
* */
public class Ex2_12_13 {
    public static void main(String[] args) {
        System.out.println(10.0/3);
        System.out.printf("%.2f%n", 10.0/3);
        System.out.printf("%d\n", 15);
        System.out.printf("%o\n", 15);
        System.out.printf("%x\n", 15);
        System.out.printf("%#o\n", 15);
        double f = 123.456789;
        System.out.printf("%f\n", f);
        System.out.printf("%e\n", f);
        System.out.printf("%g\n", f);

        System.out.printf("[%5d]\n", 10);
        System.out.printf("[%-5d]\n", 10);
        System.out.printf("[%05d]\n", 10);

        System.out.printf("%10.2f\n", f);
        System.out.printf("[%s]\n", "www.naver.com");
        System.out.printf("[%20s]\n","www.naver.com");
        System.out.printf("[%-20s]\n","www.naver.com");
        System.out.printf("[%.10s]\n","www.naver.com");
    }
}
