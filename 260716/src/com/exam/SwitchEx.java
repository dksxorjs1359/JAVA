package com.exam;

import java.util.Scanner;

/*
 * 문]
 * 세 과목을 점수를 입력받아 총점과 평균을 구하고
 * 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오
 * 학점은 평균이 90이상이면 A, 80 이상이면 B, 70이상이면 C, 60이상이면 D,
 * 60이하는 F로 처리하시오
 * 단,switch ~case 문ㅇ을 활용하시오.
 * 
 */
public class SwitchEx {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int kor,eng,mat,sum;
	char grade;
	float avg;
	System.out.print("국어 점수를 입력하세요");
	kor= sc.nextInt();
	System.out.print("영어 점수를 입력하세요");
	eng= sc.nextInt();
	System.out.print("수학 점수를 입력하세요");
	mat= sc.nextInt();
	sum=kor+eng+mat;
	avg=sum/3;
	
	switch((int)(avg/10)) {
	case 9:
		grade='A';
		break;
	case 8:
		grade='B';
		break;
	case 7:
		grade='C';
		break;
	case 6:
		grade='D';
		break;
	default :
		grade='F';
	}
	System.out.println("당신의 총점은"+ sum+"이며,평균은"+avg+"이고 ,학점은"+grade+"입니다.");
	
	}
}
