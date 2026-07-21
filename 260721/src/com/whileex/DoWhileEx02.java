package com.whileex;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n1,n2,sum=0;
		char op =' ';
		System.out.print("첫번째 정수");
		n1=sc.nextInt();
		do {
			System.out.print("연산자(+,-,*,/):");
			op=sc.next().charAt(0);
		}while(op!='+'&&op!='-'&&op!='*'&&op!='/');
		
		do {
			System.out.print("두번째 정수");
			n2=sc.nextInt();	
		}while (op =='/' &&n2==0);
		switch(op) {
		case'+' :
			sum=n1+n2;
			break;
		case'-' :
			sum=n1-n2;
			break;
		case'*' :
			sum=n1*n2;
			break;
		case'/' :
			sum=n1/n2;
			break;
		}
		System.out.println(n1+""+op+""+n2+"="+sum);
		
	}

}
