package com.ifexam;
import java.util.Scanner;
public class ifExam03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		String str;
		System.out.println("년도 입력:");
		year=sc.nextInt();
/*	
	if ((year% 4==0)&&(year%100 !=0)||(year %400==0)) {
		System.out.println(year+"년은 윤년");
	}
	else {
		System.out.println(year+"년은 평년");
	}
	*/
		str= ((year% 4==0)&&(year%100 !=0)||(year %400==0)) ?"윤년":"평년";
		System.out.println(year+"년은"+str);
	} 
}
