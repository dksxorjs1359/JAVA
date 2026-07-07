package com;

public class OperEx05 {

	public static void main(String[] args) {
		int a = 1_000_000;// 백만 1,000,000
		int b = 2_000_000;// 이백만 2,000,000
		//int = (int * int) => 결과가 int형이  때문에 (-1454759936)
	
		
		long c =(long) a * 2000000L;
		//long c =(long) 1000000L * b;
		//long c =(long) a * b;
		System.out.println(c);
		
		long k = 1_000_000 * 1_000_000;
		long m = 1_000_000 * 1_000_000L;
		
		System.out.println(k);
		System.out.println(m);
		
		
		
		
		
		
		
		
	}

}
