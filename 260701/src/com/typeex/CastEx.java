package com.typeex;

public class CastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a,b;
		a=10;
		b=10;
		int c= a+b;
		
		int i=0;
		short s=10;
		
		i=(int)(10 +3.5f);
		System.out.println(i);
		String s1 =String.valueOf(10);
		String s2 =String.valueOf(10);
		
		String s3=s1+s2;
		System.out.println(s3);
		
		int i1 =Integer.parseInt(s1);
		int i2 =Integer.parseInt(s2);
		int i3 =i1+i2;
		System.out.println(i3);
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double d3 =d1+d2;
		System.out.println(d3);
		
		
		
		
	}

}
