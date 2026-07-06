package com.typeex;
/*
 * char : 2byte -> 주로 unicode 사용
 *                             아스키 코드
 *      아스키 코드 : 1바이트 문자를 표현 0~ 255까지 문자 표현
 *      유니코드 : (세계표준문자) : 2바이트 문자를 표현, 0 ~65535 까지의 문자
 *      -세계 여러 국가의 문자들 (한자, 한글같은 비 영어권 문자는 2바이트까지 표현하기 )
 */
public class charEx {

	public static void main(String[] args) {
		char ch1='A';
		char ch2='\u0041';
		char a=' ';
		char c='\u0000';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("ch1 + ch2 : "+ch1+ch2);
		System.out.println("ch1 + ch2 : "+(ch1+ch2));
	}

}
