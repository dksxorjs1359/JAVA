package com.exam;

import java.util.Scanner;

/*
 * 문]
 * 
 * 
 * 
 */
public class ifEx05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2,n3,median;
		System.out.println("첫번째 수:");
		n1=sc.nextInt();
		System.out.println("두번째 수:");
		n2=sc.nextInt();
		System.out.println("세번째 수:");
		n3=sc.nextInt();
		if((n1+n2)<n3||(n1+n3)<n2 || (n2+n3)<n1) {
			System.out.println("삼각형이 됩니다.");
		}else{
				System.out.println("삼각형이 안됩니다.");
			}
		}
	}
