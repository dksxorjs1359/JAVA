package com.ifexam;
import java.io.*;
/*
 * 문]
 * 사용자로부터 임의의 두정수와 연산자를 입력받아
 * 해당 연산자를 처리하는 프로그램을 작성하시오
 * 단,입력은 bufferedReader로 하고모든 수는 정수 처리하시오
 * 출력
 * 첫번째수 :10
 * 연산자[+-* /%];+
 * 두번째 수 14
 */
public class ifExam04 {
	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n1,n2,result;
	char op;
	System.out.print("첫번째 수: ");
	 n1=Integer.parseInt(br.readLine());
	 System.out.print("연산자[+-* /%]: ");
	 op=br.readLine().charAt(0);
	 System.out.print("두번째 수:");
	 n2 = Integer.parseInt(br.readLine( ));
	 
	 if(op=='+') {
	 result = n1 + n2;
	 //System.out.println(n1+""+op+""+n2+"="+result);
	 System.out.printf("%d%c%d=%d",n1,op,n2,result);
	 }else if(op =='-') 
	 {
		 result = n1 - n2;
		 //System.out.println(n1+""+op+""+n2+"="+result); 
		 System.out.printf("%d%c%d=%d",n1,op,n2,result);
	 }
	 else if(op =='*') 
	 {
		 result = n1 * n2;
		 //System.out.println(n1+""+op+""+n2+"="+result); 
		 System.out.printf("%d%c%d=%d",n1,op,n2,result);
	 }
	 else if(op =='/') 
	 {
		 result = n1 / n2;
		 System.out.printf(n1+""+op+""+n2+"="+result);
	 }
	 else if(op =='%')
	 {
		 result = n1 % n2;
		 //System.out.println(n1+""+op+""+n2+"="+result);
		 System.out.printf("%d%c%d=%d",n1,op,n2,result);
	 }
	 else {
		 System.out.println("연산자를 잘못 입력하셨습니다.");
	 }
	}

}
