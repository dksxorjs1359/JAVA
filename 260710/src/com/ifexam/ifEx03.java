package com.ifexam;
import java.util.Scanner;
/*
 * 다중if~else
 *-if ~ else 가 연속되는 것을 의미함
 *조건이 참인경우 다른 조건일 경우 다 조건식을 만든다.
 *형식
 *if(조건식1){
 *실행 1
 *}else if(조건식2){
 *실행 2
 *}
 *}else if(조건식3){
 *실행 3
 *}else{
 *위의 조건식이 모두 거짓일 경우 실행
 *}
 *
 *
 *성적을 입력받아 학점을 판정하는 프로그램을 작성하시오.
 *A,B,C,D,F
 */
public class ifEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;//학점을 저장할 변수
		System.out.print("점수: ");
		score = sc.nextInt();
		if(score>=90) {
			grade='A';
		}
		else if (score>= 80) {
			grade='B';
		}
		else if (score>= 70) {
			grade='C';
		}
		else if (score>= 60) {
			grade='D';
			}
		else {
			grade='F';
	}
	
		System.out.println("당신의 점수는"+score+"이고, 학점은" +grade+"입니다.");
	}
	
}
