package com.ifexam;
import java.util.Scanner;
/*
 * 문]
 * 두사람이 하는 가위바위보 게임을 만드시오
 * 두사람 이름은 철수와 영희로 한다.
 * 먼저 철수를 출력하고 "가위 바위 보"중 하나의 문자열을 입력받는다.
 * 그리고 영희도 "가위 바위 보"중 하나의 문자열을 입력받는다.
 * 입력받은 문자열을 비교하여 누가 승리하였는지를 판별하는 프로그램을 구현하시오
 */
public class ifExam08 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String a,b;
	System.out.println("철수");
	a=sc.nextLine();
	System.out.println("영희");
	b=sc.nextLine();
	
	if(a.equals("가위")) {
    if(b.equals("바위"))
    System.out.println("영희 승리");
    
    else if(b.equals("가위"))
		System.out.println("영희 비김");
	
	else if(b.equals("보"))
		System.out.println("영희 짐");
	}
	else	if(a.equals("바위")) {
	    if(b.equals("보"))
	    System.out.println("영희 승리");
	    
	    else if(b.equals("바위"))
			System.out.println("영희 비김");
		
		else if(b.equals("가위"))
			System.out.println("영희 짐");
	}
	else if(a.equals("보")) {
	    if(b.equals("가위"))
	        System.out.println("영희 승리");
	        
	        else if(b.equals("보"))
	    		System.out.println("비김");
	    	
	    	else if(b.equals("바위"))
	    		System.out.println("짐");

		}
	}
}
