package com.whileex;
/*
 * while문 
 * 1.for문과 유사함. 특정 명령들을 반복적으로 처리
 * 2.for문은 반복횟수를 정확히 알고 있는 경우 사용,
 * while문은 반복횟수를 정확히 알지 못할 경우 사용
 * 3.무한 루프에 빠지기 쉽다(주의)
 * 
 * 형식
 * while(조건식){
 * 반복수행문장;
 * }
 * 
 * 
 * 1~100까지의 합계를 구하시오
 */
public class WhileEx01 {

	public static void main(String[] args) {
		//변수 설정
		int i = 1, sum=0;
		while (i<=100) {//조건식
			sum +=i;//반복수행문
			i++;//증감식
		}
		System.out.println("1~100까지의 합계"+sum);
		System.out.println();
		
		while(i<=100) {//조건식
			sum+=i; //반복수행문
			i++;//증감식
			
		}
		System.out.println("1~100까지의 합계"+sum);
	}

}
