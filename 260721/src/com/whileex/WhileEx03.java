package com.whileex;
/*
 * 문]사용자로부터 숫자를 하나 입력받아서, 그 수만큼 "I Love You !!"를
 * 출력하는 프로그램을 구현하시오
 * 단 while문을사용
 * 
 * 결과 숫자입력 : 6
 * I Love you!!
 * I Love you!!
 * I Love you!!
 * I Love you!!
 * I Love you!!
 * I Love you!!
 * 
 */

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i=1;
		System.out.print("숫자 입력");
		n= sc.nextInt();
		
		while(i<=n ) {
			System.out.println("I Love you");
			i++;
		}
	}

}
