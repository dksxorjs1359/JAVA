package com.forexam;

import java.util.Scanner;

public class ForExam04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, multi=1;

        System.out.print("승수 입력 : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            multi *= 3;
        }

        System.out.println("3의 " + n + "승은 " + multi + "입니다.");

        sc.close();
    }
}