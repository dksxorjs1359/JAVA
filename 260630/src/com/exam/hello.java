package com.exam;
/* 주석(comment)
 * -프로그램 코드에 대한 설명을 적절히 적어놓은것
 * 
 * 주석을 작성하는 방법은 아래의 두가지 방법이 있다
 * 
 * 
 */

//한줄 주석 ://부터 라인 끝까지의 내용은 주석으로 처리한다.
/*여러줄의 내용을 주석으로 처리한다. */

public class hello {

	public static void main(String[] args) {//프로그램의 시작을 의미함
		abc aa =new abc();
		aa.aa();
System.out.println("hello, world");//hello, world를 출력하라
System.out.println("hello,world.//주석 따음표 안에있는건 주석아님 문자로 인식함");
	}//프로그램의 끝을 의미함

}
