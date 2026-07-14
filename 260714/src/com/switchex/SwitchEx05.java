package com.switchex;
import java.util.Scanner;
/*
 * 문]
 * 사용자로부터 임의의 두 정수와 연산자를 입력받아
 * 해당 연산자의 처리 결과를 출력하는 프로그램을 구현하시오.
 * 단, switch ~ case 문으로 구현하시오
 * 결과 
 * 첫번째 정수 : 2
 * 연산자 입력[+-* /%]:+
 * 두번째 정수 : 3
 * 2+3=5
 */
public class SwitchEx05 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n1, n2, result;
	char op;
	System.out.println("첫번째 정수를 입력하세요");
	n1= sc.nextInt();
	System.out.println("연산자[+-* /%]: ");
	op = sc.next().charAt(0);
	System.out.println("두번째 정수를 입력하세요");
	n2= sc.nextInt();
	switch(op){
	case '+':
		result=n1+n2;
		System.out.printf("%d+%d=%d입니다.",n1,n2,result);
		break;
	case '-':
		result=n1-n2;
		System.out.printf("%d-%d=%d입니다.",n1,n2,result);
		break;
	case '*':
		result=n1*n2;
		System.out.printf("%d*%d=%d입니다.",n1,n2,result);
		break;
	case '/':
		result=n1/n2;
		System.out.printf("%d/%d=%d입니다.",n1,n2,result);
		break;
	case '%':
		result=n1%n2;
		System.out.printf("%d%%%d=%d입니다.",n1,n2,result);
		break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}

}
