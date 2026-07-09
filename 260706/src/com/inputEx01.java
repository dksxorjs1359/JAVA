package com;


/*
 * 아스키 코드 입력받기
 * system.in.read();
 * 기본적으로 알아야 할 아스키 코드 값
 * '\b'=8, '\t'=9,'\n'=10,
 * 48~57 :0~9
 * 65~90 : A~Z
 * 97~122 : a ~ z
 */
import java.io.*;
public class inputEx01 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자입력 :");
		int i= System.in.read();
		System.out.println("ASCII 코드 값 : "+(char)i);
	}

}
