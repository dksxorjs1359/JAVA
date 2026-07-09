package com;
/*
 * 
 * 조건 삼항 연산자
 * 조건항? 참일때 : 거짓일때;
 * 
 */

public class OperEx13 {

	public static void main(String[] args) {
	int a=20;
	int b=30;
	int max = 0;
	max = a > b? ++a : ++b;//거짓이면 b를 증가
	System.out.println(max);
	}

}
