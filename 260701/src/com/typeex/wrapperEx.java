package com.typeex;
/*wrapper Class :기본 데이터형의 class화 시킴
 기본데이터형         class화
 * byte         Byte
 * short       Short
 * int          Integer
 * long         Long
 * float         Float
 * double     Double
 * boolean  Boolean
 * char       Character
 * 
 * 
 */
public class wrapperEx {

	public static void main(String[] args) {
		byte b_min = Byte.MIN_VALUE;
		byte b_max = Byte.MAX_VALUE;
		short s_min = Short.MIN_VALUE;
		short s_max = Short.MAX_VALUE;
		int i_min = Integer.MIN_VALUE;
		int i_max = Integer.MIN_VALUE;
		long l_min = Long.MIN_VALUE;
		long l_max = Long.MAX_VALUE;
		
		int i_size = Integer.SIZE;
		System.out.println(i_size);
		
		System.out.println("byte:"+b_min +"~"+b_max);
		System.out.println("short:"+s_min +"~"+s_max);
		System.out.println("int:"+i_min +"~"+i_max);
		System.out.println("long:"+l_min +"~"+l_max);
	}

}
