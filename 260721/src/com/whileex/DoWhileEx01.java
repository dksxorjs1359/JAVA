package com.whileex;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int kor,eng,mat,sum=0;
	float avg = 0.0f;
	
	do {
		System.out.print("국어점수 :");
		kor=sc.nextInt();
	}while(kor<0||kor>100);
	do {
		System.out.print("영어점수 :");
		eng=sc.nextInt();
	}while(eng<0||kor>100);
	do {
		System.out.print("수학점수 :");
		mat=sc.nextInt();
	}while(mat<0||kor>100);
	
	sum=kor+eng+mat;
	avg=sum/3.0f;
	
	System.out.println("총점 :"+sum);
	System.out.printf("평균%.2f",avg);
	}

}
