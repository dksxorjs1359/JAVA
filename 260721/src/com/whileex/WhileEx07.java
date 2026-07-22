package com.whileex;

import java.util.Scanner;

public class WhileEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1,n,sum=1;
		//변수처리
		System.out.println("승수 입력");
		n=sc.nextInt();
		
		while(i<=n) {//조건식
			//연산처리
			i++;//증감처리
			sum*=2;
		}
		System.out.println("2의"+n+"승은"+sum+"입니다.");
	}

}
