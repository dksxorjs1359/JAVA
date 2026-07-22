package com.whileex;
/*
 * 문]
 * -50에서 부터 1까지의 수가 줄어드는 프로그램을 구현하시오
 * 단 한줄에 5개의 수만 출력하고 수들 사이의 간격을 띄우시오
 * 
 * -50 -49 -48 -47 -46
 * ~~~~~
 * ~~~~~
 * ~~~~~
 * ~~~~~
 * -5 -4 -3 -2 -1
 * 0  1
 */
public class WhileEx09 {

	public static void main(String[] args) {
	int i=-50;
	while(i<=1) {
	System.out.print(i+"\t");
	i++;
	if (i%5==0)
		System.out.println();
		}
	}
}