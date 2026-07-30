package com.arrayextwo;
/*
 * 문]
 * 5명의 학생이 3과목 점수를 더해서 각 학생별 총점과 평균을 계산하고,
 * 과목별 총점을 계산하는 프로그램을 구현하시오.
 * 1->100,100,100
 * 2->20,20,20
 * 3->30,30,30
 * 4->40,40,40
 * 5->50,50,50
 * 		240 240 240
 * 
 */
public class ArrayEx09 {

	public static void main(String[] args) {
		int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
		};
		int korTot=0, engTot=0, matTot=0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=============");
		for(int i =0; i<score.length;i++) {
			int sum=0;
			float avg =0.0f;
			
			korTot +=score[i][0];
			engTot +=score[i][1];
			matTot +=score[i][2];
		System.out.printf("%3d",i+1);
		for(int j = 0 ; j < score[i].length; j++) {
			sum+=score[i][j];
			System.out.printf("%5d",score[i][j]);
		}
		avg=sum/(float)(score[i].length);
		System.out.printf("%5d %5.2f%n",sum,avg);
		}
		System.out.println("===============");
		System.out.printf("총점 : %4d %4d %4d%n",korTot,engTot,matTot);
	}

}
