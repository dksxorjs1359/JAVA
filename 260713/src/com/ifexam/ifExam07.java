package com.ifexam;
import java.io.*;
public class ifExam07 {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char ch;
	int n;
	System.out.print("알파벳 한문자를 입력하시오");
	n=Integer.parseInt(br.readLine());
	if(n >= 65&&n<=90) {
		n+=32;
		ch=(char)n;
		System.out.printf("변환한 값 :"+ch);
	}
	else if(n >= 97&&n<=122) {
		n-=32;
		ch=(char)n;
		System.out.println(+ch);
	}
	else {
		System.out.println("입력오류");
	}
	}
	

}
