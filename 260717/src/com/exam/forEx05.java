package com.exam;
/*
 * 변수 i의 값이 1부터 10까지 변하는 동안, 다양한 연산자를 이용해서
 * 짝수,홀수,제곱,역순(11-i),순환(i%3),반복(i/3)을 구하는 프로그램을 구현하시오.
 * 
 */
public class forEx05 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %d%n",i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
	}

}
