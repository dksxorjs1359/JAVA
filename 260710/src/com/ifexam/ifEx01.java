package com.ifexam;
import java.util.Scanner;
public class ifEx01 {

	public static void main(String[] args) {
	//시험점수가 80점이상이라면 합격을 판정하는 프로그램을작성하시오
		Scanner sc=new Scanner(System.in);
		int score;
		System.out.print("점수입력 : ");
		score = sc.nextInt();
		//단순if :명령어가 하나일경우
		if(score>=80)
			System.out.println("합격");
	}
}

