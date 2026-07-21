package com.ForExam;
public class ForEx001 {

	public static void main(String[] args) {
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.printf("[%d,%d]",i,j);
		}
			System.out.println();
		}
		for(int i=1; i<=9; i++) {//행
			for(int j=1; j<=10; j++) {//열
				System.out.printf("%3d * %3d = %3d ",j,i,i*j);
			}
			System.out.println();//열이 끝나고 줄을 바꾼다.
		}
			System.out.println();//열이 끝나고 줄을 바꾼다.
		for(int i=2; i<=9; i++) {//행
			for(int j=1; j<=10; j++) {//열
				System.out.printf("%d * %d = %02d ",i,j,i*j);
		}
			System.out.println();//열이 끝나고 줄을 바꾼다.
		}
		for(int i=1; i<=9; i++) {//행
			for(int j=2; j<=10; j++) {//열
				System.out.printf("%d * %d = %02d ",j,i,i*j);
		}
			System.out.println();//열이 끝나고 줄을 바꾼다.
		}
	}
}
