package com.whileex;
/*
 * 문]
 * -1^2+2^2-3^2+4^2-5^2....+100^2의 합계를 구하는 프로그램을 작성하시오
 * 단 while문 활용
 * 
 * 
 * 
 */
public class WhileEx08 {

	public static void main(String[] args) {
	int sum=0, i=1, plus=1, sum1=0, sum2=0;
	while( i<=100) {
		/*if(i%2==0)
			sum1 +=i*i;
		else
			sum2-=i*i;
		*/
		plus = -plus;
		sum +=plus*(i*i);
		i++;
	}
	//System.out.println("결과 :"+(sum1+sum2));
	System.out.println("결과 :"+sum);
	}
	

}
