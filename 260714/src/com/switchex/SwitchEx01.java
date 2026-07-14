package com.switchex;
import java.util.Scanner;
/*
 * switch ~ case
 * 1.다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 여러개의 처리문을
 * 		한번에 수행하는데 유용하다
 * 2.if문은 조건없이 boolean형이고
 *  switch문은 조건이 정수형(int,byte,short)과 문자형(char)임 
 * 3.long, string, boolean,float,double형은 사용안함
 * 4.break문이 없을 경우 다음 break문을 만날때까지 모든 문장을 실행함
 * 5.인자값과 비교값이 일치하지 않으면 default 문을 실행함
 * 6.주의사항
 * 		case문 뒤에 오는 조건값이 중복되지않도록 해야함
 * 형식
 * switch(인자값){
 * case 조건1 : 수행문장 (처리문); break;
 * case 조건2 : 수행문장(처리문); break;
 * case 조건2; 수행문장(처리문); break;
 * default :수행문장; break; -> 생략가능
 * }
 * 문]
 *  현재 몇월인지를 입력받아 해당하는 계절을 출력하는 프로그램을 구현하시오
 *  
 * 
 * 
 */
public class SwitchEx01 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("몇월인지 입력하시오:");
	int month =sc.nextInt();
	
	if(month ==3 || month==4 ||month==5){
	System.out.println("현재의 계절은 봄입니다.");
	}
	else if(month ==6 || month==7 ||month==8) {
	System.out.println("현재의 계절은 여름입니다.");
	}
	else if(month ==9 || month==10 ||month==11) {
		System.out.println("현재의 계절은 가을입니다.");
	}else if(month ==12 || month==1 ||month==2) {
	System.out.println("현재의 계절은 겨울입니다.");
	}else
		System.out.println("해당되는 계절이 없습니다.");
	/*
	switch(month) {
	case 3:case 4: case 5:
		System.out.println("현재의 계절은 봄 입니다.");
		break;
	}
	switch(month) {
	case 6:case 7: case 8:
		System.out.println("현재의 계절은 여름 입니다.");
		break;
	}
	switch(month) {
	case 9:case 10: case 11:
		System.out.println("현재의 계절은 가을 입니다.");
		break;
	}
	switch(month) {
	case 12:case 1: case 2:
		System.out.println("현재의 계절은 겨울 입니다.");
		break;
		default :
			System.out.println("해당하는 계절이 없습니다.");
		*/
		}
	}
