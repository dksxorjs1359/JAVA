package com.exam;
/*
 * 문]
 * 2자리 정수를 입력받아, 십의자리와 1의자리가
 * 같은지 판별하는 프로그램을 구현하시오.
 * 결과 
 * 2자리 정수 입력 : 77
 * 10의자리와 1의자리가 같습니다.
 * /=>십의자리
 * %=>1의자리
 */

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n, the,one;
	System.out.println("2자리의 정수를 입력해주세요");
	n=sc.nextInt();
	the=n/10;
	one=n%10;
	
	if(n<=10||n>=99) {
		System.out.println("10~ 99 사이의 정수만 입력하시오");
	return ;
	
		}
	if(the==one) {
		System.out.println("10의자리와 1의자리가 같습니다.");
	}
	else {
		System.out.println("10의자리와 1의자리가 같지 않습니다.");
	}
	}

}
