package com.whileex;

import java.util.Scanner;

/*
 * 문]
 * 		입력된 정수의 평균을 구하는 프로그램을 작성하시오
 * 		먼저 입력할 정수의 개수를 입력받고, 입력받은 정수 만큼의
 *		평균을 출력한다.
 *		입력받은 값은 정수인지만,평규값은 실수가 될것임
 *		
 *
 *		결과
 *		정수의 개수 :4
 *		정수 입력 :2
 *		정수 입력 :7
 *		정수 입력 :2
 *		정수 입력 : 4
 * 		입력한 정수의 합계 : 3.75
 */
public class WhileEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
	    int num;
	    int sum = 0;
	    float avg=0f;
	    
	    System.out.print("입력 할 정수의 개수");
	    count=sc.nextInt();
	    int i=1;
	    while(i<=count) {
	    	System.out.print("정수 입력 :");
	    	num=sc.nextInt();
	    	sum+=num;
	    	i++;
	    }
	    avg =(float) sum/count;
	    System.out.printf("입력한 정수의 평균 :%.2f",avg);
		}	
	}


