/*
 * 
 * 
 * 
 * 
 */
package com.ifexam;
import java.util.Scanner;
public class ifEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score, year;
		System.out.print("점수 : ");
		score= sc.nextInt();
		System.out.print("학년 : ");
		year= sc.nextInt();
		
		if(score >=60) 
		{//점수가 60점 이상인 사람만 판정한다
			if(year !=4) 
			{
				System.out.println("합격");
		    } 
			else if(score>=70)
			{//4학년이면서 점수가 70점 이상인경우 합격
		    	System.out.println("합격");
		    } 
			else 
			{//4학년이면서 70점 이하면 불합격
			System.out.println("불합격");
		    }
		}
		else 
		{
			System.out.println("불합격");
		}
	}
}