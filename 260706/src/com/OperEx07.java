package com;
//패키지? 뭐임이거?
//아 이런내용이래

public class OperEx07 {
//퍼블릭? 클래스? 이건 내가 지은이름
	public static void main(String[] args) {
		char c1='a';
		//char는 문자를 하나만 저장할 수 있다.
		//왜? 4byte? 인가 그럼. 그래서 문자 하나 넣으면 그릇이 꽉참!
		char c2= c1;
		char c3 = ' ';
		int i=c1+1;//97+1
		
		
		System.out.println(i);
		c3= (char)(c1+1);
		//		형변환
		//			왜 하는데? int를 char에 담을수가 없어서.
		c2++;
		c2++;
		System.out.println(i);
		System.out.println(c2);
		System.out.println(c3);
	}

}
