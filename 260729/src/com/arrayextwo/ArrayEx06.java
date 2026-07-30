package com.arrayextwo;
/*
 *  레기드 배열, 비정형 배열, 가변배열
 *  -자바에 배열은 1차원만 관리함
 *  int[][] arr = new int [3][];
 *  
 * arr[0] =new int[2];
 * arr[1]= new int[1];
 * arr[2]= new int[3];
 * 
 * 
 * 
 */
public class ArrayEx06 {

	public static void main(String[] args) {
		int[][] arr= new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		//배열의 값 저장
		arr[0][0]=100;
		arr[0][1]=200;
		arr[1][0]=300;
		
		arr[2][0]=400;
		arr[2][1]=500;
		arr[2][2]=600;
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
