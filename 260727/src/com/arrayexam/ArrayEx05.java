package com.arrayexam;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/*
 * 문]
 *  정수로 된 돈의 금액을 입력받아 오만원권, 만원권, 천원권, 500원자리 동전,
 *  100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전의 각 몇개인지를
 *  변환하는 프로그램을 구현하시오. 단 반드시배열을 이용하여 구현하시오
 *  
 *  int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
 *  결과
 *  금액 입력 : 65376
 *  오만원권 1매
 *  만원권 1매
 *  천원권 5매
 *  백원 3개
 *  오십원 1개
 *  십원 2개
 *  일원 6개
 */
public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	
	
	System.out.println("결과 입력 :");
	int m=sc.nextInt();
	
	for(int i = 0; i<unit.length; i++) {
		int result =m/ unit[i];
		
		if(result > 0) {
			System.out.println(unit[i]+"원짜리 :"+result+"개");
		m %=unit[i];
		}
	}
	}

}
