package com.ifexam;
import java.io.*;
/*
 * 사용자로부터 임의의 정수 세개를 입력받아
 * 작은 수 부터 큰수 순으로 출력하는 프로그램을 구현하시오.
 * 단, swap을 이용하여 구현
 * 결과
 * 첫번째 수:16
 * 두번째수 : 8
 * 세번째 수 : 21
 * 정렬 결과: 8 16 21
 */
public class ifExam05 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2 ,n3,temp;//변수 선언
		System.out.print("첫번째 수: ");
		 n1=Integer.parseInt(br.readLine());
		System.out.print("두번째 수: ");
		n2=Integer.parseInt(br.readLine());
		System.out.print("세번째 수: ");
		n3=Integer.parseInt(br.readLine());
		
		if(n1>n2){//첫번째 수가 두번째 수보다 크면 자리를 바꿈
			/*temp = n1;
		    n1 = n2;     
		   n2 = temp;
		   */
			n1= n1^n2;
			n2= n2^n1;
			n1= n1^n2;
		}
		if(n1>n3){
			/*temp = n1;
		    n1 = n3;     
		    n3 = temp;
		    */
			n1= n1^n3;
			n3= n3^n1;
			n1= n1^n3;
		}
		if(n2>n3) {
			/*temp = n2;
		    n2 = n3;     
		    n3 = temp;
		    */
			n2= n2^n3;
			n3= n3^n2;
			n2= n2^n3;
		}
		System.out.printf("결과는 %d,%d,%d입니다",n1,n2,n3);
	}

}
