package com;

public class OperEx12 {
	
	boolean a ;
	boolean b ;
	public static void main(String[] args) {
		boolean a=false;
		boolean b=false;
		OperEx12 oe = new OperEx12();
		if((oe.a=4 >3)||(oe.b=5>7)) {
			System.out.println(oe.a);
			System.out.println(oe.b);
		}
		if((a=4 >3)||(b=5>7)) {
			System.out.println(a);
			System.out.println(b);
		}
		//에러 이유 : 초기화가 안되었기 때문에
	}

}
