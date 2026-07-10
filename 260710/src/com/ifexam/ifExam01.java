package com.ifexam;
import java.util.Scanner;
/*문
 * 사용자로부터 이름,국어 영어,수학점수를 입력받아
 * 총점과 평균을 구한 후 학점을 판정하는 프로그램을 작성하시오
 *결과
 *이름:홍길동
 *국어10
 *영어10
 *수학10
 *
 *당신의 이름은 홍길동이며, 총점은 30점이고 평균은 10점입니다.
 */
public class ifExam01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int kor,eng,mat,score,mean;
		char grade;
		System.out.print("이름을 입력하세요");
		name=sc.nextLine();
		System.out.print("국어 점수를 입력하세요");
		kor=sc.nextInt();
		System.out.print("수학 점수를 입력하세요");
		eng=sc.nextInt();
		System.out.print("영어 점수를 입력하세요");
		mat=sc.nextInt();
		score=kor+eng+mat;
		mean=score/3;
		if(mean>=90) {
			grade='A';
			System.out.println("당신의 이름은 이름은"+name+"이며 총점은"+score+"이고, 평균은"+mean+"입니다.");	
			System.out.println("학점은"+grade+"입니다");
		}
		else if(mean>=80) {
			grade='B';
			System.out.println("당신의 이름은 이름은"+name+"이며 총점은"+score+"이고, 평균은"+mean+"입니다.");
			System.out.println("학점은"+grade+"입니다");
		}
		else if(mean>=70) {
			grade='C';
			System.out.println("당신의 이름은 이름은"+name+"이며 총점은"+score+"이고, 평균은"+mean+"입니다.");
			System.out.println("학점은"+grade+"입니다");
		}
		else if(mean>=60) {
			grade='D';
			System.out.println("당신의 이름은 이름은"+name+"이며 총점은"+score+"이고, 평균은"+mean+"입니다.");
			System.out.println("학점은"+grade+"입니다");
		}
		else if(mean>=60) {
			grade='E';
			System.out.println("당신의 이름은 이름은"+name+"이며 총점은"+score+"이고, 평균은"+mean+"입니다.");
			System.out.println("학점은"+grade+"입니다");
	}
		else;
		grade='F';
		System.out.println("당신의 이름은 이름은"+name+"이며 총점은"+score+"이고, 평균은"+mean+"입니다.");
		System.out.println("학점은"+grade+"입니다");
}
}