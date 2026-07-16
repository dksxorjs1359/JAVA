package com.exam;

import java.util.Scanner;

/*문
 * 2차원 평면에서 직사각형은 왼쪽상단 모서리와 오른쪽 하단 모서리의
 * 두 점으로 표현한다. *(100,100)과 (200,200)의 두 점으로 이루어진
 * 사각형이 있을때 정수 x,y값을 입력받고 점(x,y)가 이 직사각형 안에 있는지를
 * 판별하는 프로그램을 구현하시오.
 *결과
 *점(x,y)의 좌표입력 : 150 150
 *(150,150)는 사각형 안에 있습니다. 
 * 
 */
public class ifEx07 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("x,y좌표를 입력해주세요");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if((x>=100&&x<=200)&&(y>100&&y<=200))//점이 사각형 안에 있는경우
		{
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		}else//점이 사각형 안에없는경우
		{	
				System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
		}
	}

}
