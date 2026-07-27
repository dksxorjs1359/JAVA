package com.arrayexam;

import java.util.Scanner;

/*
 * 문2]
 * 		 정수를 입력받고 아래와 같이 *을 출력하는 프로그램을 작성하시오
 * 		 정수입력 : 5
 * 		 *****
 * 	     ****
 *      ***
 *      **
 *      *
 * 
 * 
 */
public class ArrayEx02 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a;
	System.out.print("정수를 입력하세요 : ");
	a=sc.nextInt();
	for(int i=a; i>0; i--) {
		for(int j=0; j<i; j++)	
			System.out.print("*");
			System.out.println();
	}
	
	}
}
