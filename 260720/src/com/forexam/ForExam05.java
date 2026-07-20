package com.forexam;

import java.util.Scanner;

/*문]
 * 두개의 정수를 입력받아 그사이에 존재하는 정수들의 합을 구하는 프로그램을 작성하시오.
 * 
 * 3과 5를 입력 받는다면 3+4+5의 합이 답이됨
 * 
 * 결과
 * 첫번째 정수 :
 * 두번째 정수 :
 * 두 정수 사이에 존재하는 정수들의 합 : 39
 * 
 * 
 */
public class ForExam05 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int n1, n2;
    int sum=0;
	System.out.print("첫번째 정수 입력 : ");
    n1 = sc.nextInt();
    System.out.print("두번째 정수 입력 : ");
    n2 = sc.nextInt();
    if(n1>n2) {
    	n1=n1^n2;
    	n2=n2^n1;
    	n1=n1^n2;
    }
    
    for (int i = n1; i <= n2; i++) {
        sum += i;
    }

    System.out.println("두 정수 사이에 존재하는 정수들의 합 :"+sum);

    sc.close();
	}

}
