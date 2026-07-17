package com.exam;
/*
 * 반복문
 * -for, while, do~ while
 * 
 * for문
 * -처음부터 반복횟수를 알고 있는 경우
 * while문과 do~whle문은
 * -반복횟수를 알수 없고 조건에 따라 반복이 계속되거나 중단되는경우 사용
 * while :반복 조건을 처음부터 따지는 경우
 * do ~ while:반복조건을 나중에 따지는 경우
 * 
 * for문 형식
 * for(초기값; 조건식; 증감식){
 * 반복적인 수행할 문장
 * }
 * 
 * 1. 초기값
 * - 조건식에서 사용하는 변수를 초기화한다.
 *  .초기문은 시작할때 한번만 수행됨
 *  .콤마로 분리하여 여러 문장을 나열할 수 있음
 *  .초기문은 빈상태로 두어도 되지만 끝에 세미콜론은 있어야함'
 *  2.조건식
 *  -조건식에는 논리형 변수나 논리연산을 사용함
 *  조건식의 결과 true이면 반복이 계속되면,false이면 for문을 벗어남
 *  
 * 문] 1~ 10까지 덧셈으로 표시하고 합계를 출력하는 프로그램을 구현하시오
 * 
 * 
 * 
 */
public class forEx01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.print(i);

            if (i < 10) {
                System.out.print("+");
            } else {
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }
}
