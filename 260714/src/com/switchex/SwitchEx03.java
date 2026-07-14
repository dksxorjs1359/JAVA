package com.switchex;
import java.util.Scanner;
/*
 * 문]
 *주민등록번호를 입력받아 성별을 확인하는 프로그램을 구현하시오
 *1,3:남,2,4:여
 *
 *
 *
 *
 */
public class SwitchEx03 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("주민번호를 입력하세요");
	char jumin=sc.next().charAt(7);
	switch(jumin) {
	case '1': case '3':
		System.out.println("남성입니다.");
		break;
	case '2': case '4':
		System.out.println("여성입니다.");
		break;
		default :
			System.out.println("유효하지않는 성별입니다.");
	}
	}

}
