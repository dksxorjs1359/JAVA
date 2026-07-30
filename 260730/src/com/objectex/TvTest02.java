package com.objectex;

public class TvTest02 {

	public static void main(String[] args) {
		Tv[]tvArr=new Tv[3];//길이가 3인 tv객체 배열선언
		//tv 객체를 생성해서 tv객체 배열에 각 요소를저장
		for (int i = 0; i<tvArr.length; i++) {
			tvArr[i]=new Tv();//tvArr 객체 3개를 생성
			tvArr[i].channel = i + 10;
		}
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel : %d%n",i,tvArr[i].channel);
	/*
	 * 클래스 -> 데이터와 함수의 결합
	 * 
	 * 변수 -> 배열 ->구조체 -> 클래스
	 * 변수 : 하나의 데이터를 저장할수 있는 공간
	 * 배열 : 같은 종류의 데이터를 여러개 저장할수 있는 공간
	 * 구조체 : 서로 관련된 여러 데이터를 종류에 상관없이 하나의 집합으로 저장할수 있는 공간
	 * 클래스 : 데이터와 함수의 결합(구조체 + 함수)
	 */
		}
		
	}

}
