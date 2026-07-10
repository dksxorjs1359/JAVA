package com.ifexam;
import java.util.Scanner;
/*
 * 문]
 * 		임의의 정수를 입력받아 입력받은 정수가 짝수인지, 홀수인지, 영인지, 
 * 		아니면 판독불가인지를 판정하는 프로그램을 작성하시오
 * 
 * 		결과
 * 		40 ==> 짝수
 * 		41 ==> 홀수
 *     0 ==> 영
 */
public class ifExam02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력하세요");
		num=sc.nextInt();
		
		if(num == 0) {
			System.out.println(num+"==>영");
		}else if (num %2 == 0) {
			System.out.println(num+"==>짝수");
		}else if(num %2!=0) {
			System.out.println(num+"==>홀수");
		}else {
			System.out.println(num+"==>판독불가");
		}
			
	}
}
