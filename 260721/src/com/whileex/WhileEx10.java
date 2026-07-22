package com.whileex;

import java.util.Scanner;

/*
 * 문]
 * 콜라,사이다,마운틴,초코송이,에이스,웨하스가 나오는 자판기 프로그램을 구현하시오.
 * 
 * 결과
 * 콜라-1,사이다-2,마운틴-3,초코송이-4,에이스-5,웨하스-6,종료-0 :3
 * 마운틴
 * 콜라-1,사이다-2,마운틴-3,초코송이-4,에이스-5,웨하스-6,종료-0 :4
 * 초코송이
 * 콜라-1,사이다-2,마운틴-3,초코송이-4,에이스-5,웨하스-6,종료-0 :0
 * 프로그램을 종료합니다
 * 
 * 
 */
public class WhileEx10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=1;
	String str="";
	while(true) {
		System.out.print("콜라-1,사이다-2,마운틴-3,초코송이-4,에이스-5,웨하스-6,종료-0 :");
		n=sc.nextInt();
		switch(n) {
		case 0: str="프로그램을 종료합니다.";
		System.exit(0);
		case 1: str="콜라"; break;
		case 2: str="사이다"; break;
		case 3: str="마운틴"; break;
		case 4: str="초코송이"; break;
		case 5: str="에이스"; break;
		case 6: str="웨하스"; break;
		default :str ="선택하신 상품이 없습니다."; break;
		}
		System.out.println(str);
		
	}
}
}
