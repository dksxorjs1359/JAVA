package com.whileex;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 정수");
			int a= sc.nextInt();
			System.out.print("두번째 정수");
			int b= sc.nextInt();
			System.out.print("두 정수의 합 :"+(a+b));
			
			
			System.out.print("계속 진행 하시겠습니까?(y/n)");
			char ch = sc.next().charAt(0);
			if(ch == 'N'|| ch == 'n')
				break;
		}
	}

}
