package com;

public class WriteEx {

	public static void main(String[] args) {
		System.out.write(65);
		System.out.flush();//버퍼의 있는 내용을 출력해라
		System.out.println();
		byte[]by= {'J','A','V','A'};
		System.out.write(by,0,4);
	}

}
