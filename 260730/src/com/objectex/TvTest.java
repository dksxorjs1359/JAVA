package com.objectex;

public class TvTest {

	public static void main(String[] args) {
		Tv t1;//tv 인스턴스르 참조하는 변수를 선언
		t1 = new Tv();//Tv인스턴스 생성(객체)
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널 값은 "+t1.channel+"입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+"입니다");
		
		t2=t1; //t1
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경");
		System.out.println("t1의 채널 값은 "+t1.channel+"입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+"입니다");
		t1.channeldown();//채널 다운
		System.out.println("t1의 채널 값은 "+t1.channel+"입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+"입니다");
		
		Tv[]tt=new Tv[10];//객체배열
		for(int i =0; i< tt.length; i++) {
			tt[i] = new Tv();
			tt[i].channel =i*10;
			System.out.println("tt["+i+"] : "+ tt[i].channel);
		}
		/*
		 * 변수 : 하나의 데이터를 저장할 수 있는 공간
		 * 배열 : 같은 종류의 데이터를 여러개 저장할수 있는 공간
		 * 클래스 : 데이터와 함수의 겹합체 여러개의 데이터를 저장할 공간을 만듬
		 * 
		 * 
		 * 
		 */
	}

}
