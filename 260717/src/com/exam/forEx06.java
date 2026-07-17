package com.exam;

import java.util.Scanner;

/*문]0에서 부터 입력한 정수까지의 합계를 구하는 프로그램을 구현하시오
정수입력 : 20
0부터 20까지의 합계 : 210
*/
public class forEx06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,n;
		System.out.print("정수입력 : ");
		n=sc.nextInt();
		for(int i = 0; i<=n ;i++) {
			sum +=i;
		}
		System.out.println("0부터"+n+"까지의 합계 : "+sum);
	}

}
