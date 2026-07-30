package com.arrayextwo;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subname = { "국어", "영어", "수학" };

		int[][] sub = new int[3][subname.length + 2];
		/*
		 * [3]=>3명 0:첫번째 사람 1:두번째사람, 2:세번째 사람 [subname.length+2]; 국어,영어,수학,합계,석차 0 1 2
		 * +1 +2
		 */
		float[] avg = new float[3];
		// 각 사람에 대한 과목별 점수를 입력받는다.
		for (int k = 0; k < sub.length; k++) {
			System.out.println((k + 1) + "번째 사람");
			for (int i = 0; i < sub[k].length - 2; i++) {
				// 과목 및 합계를 저장할 공간을 변수 i
				do {
					System.out.println(subname[i] + "점수:");
					sub[k][i] = sc.nextInt();

				} while (sub[k][i] < 0 || sub[k][i] > 100);
				sub[k][sub[k].length - 2] += sub[k][i];
				// 합계
			}
			avg[k] = sub[k][sub[k].length - 2] / (float) sub[k].length - 2;// 합계
			sub[k][sub[k].length - 1] = 1;// 석차
			// 한사람의 과목 점수 입력작업이 끝남
		}

		for (int k = 0; k < sub.length; k++) {
			for (int i = 0; i < sub.length; i++) {
				if (sub[k][sub[k].length - 2] < sub[i][sub[i].length - 2]) {
					sub[k][sub[k].length - 1]++;
				}
			}
		}

		System.out.println();
		for (int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println(sub[k][sub[k].length - 1] + "등");
			System.out.println("총점" + sub[k][sub[k].length - 2]);
			System.out.printf("평균 : %2f", avg[k]);
		}
	}

}
