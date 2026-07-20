package com.forexam;

import java.util.Scanner;

/*
 * 문]
 * 사용자로부터 원하는 단을 입력받아 구구단을 출력하는 프로그램을 작성하시오.
 * 단, 1~9까지의 수만 입력받는다. 범위를 벗어나면 종료한다.
 * 원하는 단 입력 : 7
 * 7*1=7
 * 7*2=14
 * 7*3=21
 * 7*4=28
 * ~
 * 7*9=63
 * 
 */
public class ForExam08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("원하는 단을 입력하세요");
	n=sc.nextInt();
	if (n < 2 || n > 9){
		System.out.println("2~9단만 입력하세요");
		return;
		}
	for(int i=1; i<=9; i++) {
	
	  System.out.println(n+"*"+i+"="+n*i);
		}
	}
}
