package com.exam;

public class OperExam05 {

	public static void main(String[] args) {
		int a= 7,b=3, imsi;
		
		System.out.println("바꾸기 전 => a="+a+"b="+b);
		/*imsi = a;
		a = b;
		b=imsi;
		*/
		a= a^b; //2진수계산 100=111^011
		b= b^a;//2진수 계산 111=011^100
		a=a^b;// 2진수 계산 111=100^100
		System.out.println("바꾸기 후 => a"+a+",b="+b);
	}

}
