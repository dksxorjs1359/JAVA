package com.arrayexam;

public class ArrayEx06 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int sum=0;
		float avg = 0.0f;
		for(int i=0; i< arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			
		}
		for (int i = 0; i< arr.length; i++) {
			sum += arr[i];
			System.out.printf("%3d\t",arr[i]);
		}
		System.out.println();
		System.out.printf("합계 : %d%n",sum);
		avg=sum/(float)arr.length;
		System.out.printf("평균 : %.2f",avg);
	}

}
