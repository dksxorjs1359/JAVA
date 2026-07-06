package com.exam;

public class prtExam01 {
	public static void main(String[] args) {
		int a = 100;
		float b= 123.45f;
		System.out.printf("%d\t\t\t\t\t\t\t %d\n", 100, 200);// %d가 하나면 뒤는 무시한다.
		System.out.printf("%d / %d=%07.1f\n", 100, 200, 0.5);// 7은 .을포함한 숫자의 개수를 의미 1은 소수점 한자리 까지출력 f는 실수형으로 출력
		System.out.printf("%s", "Hi ~~~ \'java!!!\'");
		System.out.printf("%c",'a');//하나만 출력
		System.out.printf("a의 값은 ==> %d\n", a);
		//int a;int는 정수 float은 실수 
		//float b;
		//a = 100;
		//b= 123.45f;
		//int a = 100;
		//float b = 123.45f;
	
	}

}
