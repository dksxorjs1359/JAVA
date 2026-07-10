package com.ifexam;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
		// if ~else 문은 if의 조건식이 참인 경우와 거짓인 경우에 각각
		// 실행할 문장을 다르게 사용함
		// if : 참,else: 참이아닐때
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자를 입력해주세요 ");
		n = sc.nextInt();
		// 단순if :명령어가 하나일경우
		if (n%2==0) {//짝수일때
			System.out.println("짝수");
		} else  {//홀수일때
			System.out.println("홀수");
		}

	}

}
