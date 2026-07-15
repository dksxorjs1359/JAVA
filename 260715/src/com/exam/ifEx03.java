package com.exam;

import java.util.Scanner;

/*
 * 문]
 * 정수로 된 돈의 금액을 입력받아 오만원권,만원권,천원권, 500원짜리동전,
 * 100원짜리 동전, 50원짜리 동전 , 10원짜리 동전, 1원짜리 동전이
 * 각 몇개인지를 변환하는 프로그램을 구현하시오
 * 결과 
 * 금액입력 :65376
 * 오만원권 1매
 * 만원권 1매
 * 천원권 5매
 * 백원 3개 
 * 오십원 1개 
 * 십원 2개
 * 일원 6개
 */
public class ifEx03 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int oman =50000;
	int man =10000;
	int chewn = 1000;
	int obak=500;
	int baek=100;
	int osib=50;
	int sib=10;
	int il=1;
	
	System.out.println("금액을 입력해주세요");
	int won=sc.nextInt();
	
	if(won >=50000) {
		oman =won/50000;
		won%=50000;
		System.out.println("5만원권"+oman+"개");
	}
	if(won >=10000) {
		man =won/10000;
		won%=10000;
		System.out.println("만원권"+man+"개");
	}
	if(won >=1000) {
		chewn =won/1000;
		won%=1000;
		System.out.println("천원권"+chewn+"개");
		}
	if(won >=500) {
		obak =won/500;
		won%=500;
		System.out.println("오백원"+obak+"개");
	}
	if(won >=100) {
			baek =won/100;
			won%=100;
			System.out.println("백원"+baek+"개");
	}
	if(won >=50) {
		osib =won/50;
		won%=50;
		System.out.println("오십원"+osib+"개");
	}
	if(won >=10) {
			sib =won/10;
			won%=10;
			System.out.println("십원"+sib+"개");
	}
		if(won >=1) {
				il =won/1;
				won%=1;
				System.out.println("일원"+il+"개");
			}
		}
	}
	

