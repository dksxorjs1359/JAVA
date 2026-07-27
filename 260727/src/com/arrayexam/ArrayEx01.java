package com.arrayexam;
/*
 * 문]
 * 
 * 
 * 
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		int[][]arr= {
				{1},
				{1,2,3},
				{1},
				{1,2,3,4},
				{1,2}			
		};
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d\t",arr[i][j]);
			}
			System.out.println();
		}
	}
}
