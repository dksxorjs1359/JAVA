package com.forexam;

import java.util.Scanner;

public class ForExam09 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n;
	System.out.print("정수 입력");
	n=sc.nextInt();
	for(int i=1;i<=n; i++) {
		System.out.println(i*3+"\t");
	}
	}

}
