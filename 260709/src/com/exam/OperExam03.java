package com.exam;
import java.util.Scanner;
/*
 * 사용자로부터 임의의 정수를 입력받아 짝수인지 홀수인지를 판정하는 프로그램을 작성하세요
 * 단 삼항연산자를 이용하여 구현하시오
 * 출력 임의의 정수 : 17
 * 17=> 홀수
 * 
 */
public class OperExam03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		String s="";
		System.out.println("임의의 정수 :");
		a=sc.nextInt();
		s=a%2==0 ? a+"짝":"홀";
		System.out.println(a+"=>"+s);
	}

}
