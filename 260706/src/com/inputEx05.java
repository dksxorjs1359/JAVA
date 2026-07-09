package com;
import java.io.*;
import java.io.IOException;

/*
 * 문자열 입력받기(하나 이상의 문자 입력받기)
 * 1. InputStreamReader is = new InputStreamReader(System.in);
 * 2. BufferedReader br = new BufferedReader(is)
 * 3. String s =br.readLine();
 * 4. 문자열을 숫자로 바꿔준다 (메소드를 활용해서)
 *     int i=Integer.parseInt(s);
 */
public class inputEx05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, hap = 0;
		System.out.print("국어점수 :");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 :");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 :");
		mat = Integer.parseInt(br.readLine());
		
		hap = kor+eng+mat;
		System.out.println("합계"+hap);
	}

}
