package com;
import java.io.*;
import java.io.IOException;

/*
 * 이름 나이 전번 주소를 입력받아 출력하는 프로그램을 구현하시오
 * 단 입력은 버퍼로더로 입력받는다
 * 
 * 
 */
public class inputEx06 {

	public static void main(String[] args) throws IOException {
		String name, tel, address;
		int age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 :");
		name = (br.readLine());
		System.out.print("나이 :");
		age = Integer.parseInt(br.readLine());
		System.out.print("전화번호 :");
		tel = (br.readLine());
		System.out.print("주소 :");
		address = (br.readLine());
		System.out.println("나의 이름은 "+name+"이고 , 나이는"+age+"이며, 전화번호는 "+tel+"이고 ,주소는"+address+"이다.");
	}

}