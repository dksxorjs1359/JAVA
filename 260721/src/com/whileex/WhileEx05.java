package com.whileex;
/*
 * 문5]
 * 사용자가 정수를입력하고
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class WhileEx05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=1,sum=0;
			do {
				System.out.print("정수입력(0->종료):");
				n=sc.nextInt();
				sum+=n;
			}while(n!=0) ;
				System.out.println("지금까지 입력한 정수의 합계 :"+sum);
			}
	
	}

