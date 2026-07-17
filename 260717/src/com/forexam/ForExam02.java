package com.forexam;

import java.util.Scanner;

/*
 * 문]
 * 양의 실수만 입력받아 입력받은 수의 평균을 구하는 프로그램을 출력하시오
 * 단, 음의 실수가 입력되면 계산하라
 * --> 음의 실수가 입력되면 종료하고 양의 실수값만 계산하여 평균을 구한다.
 * 
 * 
 */
public class ForExam02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float total, input;
	int cnt = 0;
	total=0.0f;
	total =input=0.0f;
	for ( ; input >=0.0;) {
		total +=input;
		System.out.print("양의 실수");
		input = sc.nextFloat();
		cnt++;
		}
	System.out.println("현재까지의 평균은 "+total/cnt+"입니다.");
	}
}
