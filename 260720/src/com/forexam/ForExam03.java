package com.forexam;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		for(; ;) {
			System.out.println("첫번째 정수 : ");
			n1=sc.nextInt();
			if(n1==0) return ;
			System.out.println("두번째 정수 :");
			n2=sc.nextInt();
		}
	}
	

}
