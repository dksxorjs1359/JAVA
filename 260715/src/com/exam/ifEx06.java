package com.exam;

import java.util.Scanner;

/*
 * 문]
 * 369게임을 구현하시오.
 * 1~99까지의 정수를 입력받고 정수에 3,6,9중 하나가 있는경우
 * 박수짝을 출력하고 두개 있는 경우는 박수짝짝을 출력하는 프ㅡ로그램을 구현
 * 13=>박수짝
 * 36=>박수짞짝
 * 결과 1~99사이의 정수 입력 : 36
 * 박수짝짝
 * 
 * 
 */
public class ifEx06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		int cnt=0;
		System.out.println("1~99사이의 정수를 입력하세요:");
		n=sc.nextInt();
		if(n>=1&&n<=99) {
			int sib,il;
			sib=n/10;
			il=n%10;
		if(sib !=0 && sib%3==0) {
				cnt++;
			}	
		if(il !=0 && il%3==0) {
			cnt++;
		}
		if(cnt==2) {
				System.out.println("박수짝짝");
		}else if(cnt ==1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}
		}else{
			System.out.println("숫자가 범위를 벗어났습니다.");
		}
	}
}