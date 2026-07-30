package com.arrayexam;
/*
 * 반복문을 이용하여 369 게임에서 박수를 쳐야하는 경우를 순서대로 화면에 출력하는 프로그램을 작성하시오
 * 3 박수 짝
 * 6 박수 짝
 * 9 박수 짝
 * 13 박수짝
 * 16 박수 짝
 * ------
 * 99 박수 짝짝
 * 
 * 
 */
public class ArrayEx11 {

	public static void main(String[] args) {
		String[] str= {"박수 짝", "박수 짝짝"};
		
		int result,n,num369=0;
		
		for(int i= 1; i<100; i++) {
			n=i;
			for(result = n%10;n>0; result =n%10) {
				//정수중에 3,6,9 중하나가 있는 경우 num369를 증가시킨다.
				if(result == 3 || result ==6 ||result ==9) {
					num369++;
				}
				n=n/10;
			}
			if(num369 >0) {//정수중에 3,6,9가 하나 이상인 경우
				System.out.println(i+str[num369-1]);
			}
			num369=0;
		}
	}
}
