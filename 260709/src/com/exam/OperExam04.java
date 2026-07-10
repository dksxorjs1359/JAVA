package com.exam;
/*
 * 사용자로부터 임의의 정수를 입력받아
 * 입력받은 정수가 양수인지 음수인지 0인지를 판정하는 프로그램을 구현하시오
 * 단, 3항 연산자를 활용하시오
 */
import java.util.Scanner;

public class OperExam04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		String s="";
		//입력처리
		System.out.println("임의의 정수 :");
		a=sc.nextInt();
		//연산처리
		s=a<0 ? "음수":a==0 ? "0":"양수";//조건이 맞을경우 음수를 출력 아닐경우 a=0인지 확인 맞을경우 0을 출력 아닐경우 양수를 출력 
		
		System.out.println(a+"은"+s);
	}

}
