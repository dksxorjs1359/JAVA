package com.exam;
/*
 * 문]
 * 		2차원 평면에서 직사각형을 나타내는 두 점 x,y가 있다.
 * 		직사각형을 구성하는 두점(x1,y1),(x2,y2)를 입력받아 (100,100),
 * 		(200,200)의 두점으로 이루어진 직사각형과 충돌하는지는 판별하는 프로그램을 작성하세요
 * 
 * 		아래의 메소드(함수)를 활용하시오
 * 		pubilc static boolean inRect(int x,int y, int rectx1, int recty1,
 * 		int rectx2,int rectx2){
 *     if((x>= rectx1 && x <=rectx2) && ( y>rectx1 && y<=rectx2))
 *     		return true;
 *     	else return false;
 */
import java.util.Scanner;

public class ifEx08 {

		public static boolean inRect(int x,int y, int rectx1, int recty1,
			  		int rectx2,int recty2){
			      if((x>= rectx1 && x <=rectx2) && ( y>rectx1 && y<=rectx2))
			      		return true;
			     	else 
			     	return false;
		}
			      public static void main(String[] args) {
			    	Scanner sc= new Scanner(System.in);
			    	 System.out.print("좌표 입력 : ");
			         int x1 = sc.nextInt();
			         int y1 = sc.nextInt();
			         int x2 = sc.nextInt();
			         int y2 = sc.nextInt();
			         if (inRect(x1, y1, 100, 100, 200, 200)
			        	||inRect(x1, y2, 100, 100, 200, 200)
			        	||inRect(x2, y1, 100, 100, 200, 200)
			        	||inRect(x2, y2, 100, 100, 200, 200)) {
			        	 System.out.println("사각형이 겹쳐있습니다.");//한 꼭지점이라도 4각형안에 포함되어있을경우
			         }else if (inRect(x1, y1, 100, 100, 200, 200)&&
					        	inRect(x2, y2, 100, 100, 200, 200)&&
					        	inRect(x1, y2, 100, 100, 200, 200)&&
					        	inRect(x2, y1, 100, 100, 200, 200)){
			        	 System.out.println("사각형이 겹쳐있습니다..");// 모든 꼭짓접이 4각형 안에 포함되있을경우
			         }else if (inRect(100,100,x1,y1,x2,y2)&&
					        	inRect(100,200,x1,y1,x2,y2)&&
					        	inRect(200,100,x1,y1,x2,y2)&&
					        	inRect(200,200,x1,y1,x2,y2)) {
			        	 System.out.println("사각형이 겹쳐있습니다..");//100,100,200,200 사각형의 모든 꼭짓점이 사용자가 정의사각형안에있는경우
			         }else {
			        	 System.out.println("사각형이 겹쳐있지 않습니다.");
			         }
			      
			      }

		}
