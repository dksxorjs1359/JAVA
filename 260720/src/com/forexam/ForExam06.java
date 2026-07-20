package com.forexam;

import java.util.Scanner;

/*
 * 문]
 * 계승(factorial)을 계산하는 프로그램을 작성하시오
 * n의 계승 n!을 계산
 * n! = 1x 2x 3x....xn
 * 
 * 결과
 * 정수입력 : 7
 * 7의 팩토리얼은 5040입니다
 * 
 */
public class ForExam06 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	int sum=1;
	System.out.print("정수 입력: ");
    n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        sum *= i;
       
    }
    System.out.println(n+"의 팩토리얼은"+sum+"입니다");
	}

}
