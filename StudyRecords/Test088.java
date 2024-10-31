/*==================== 
■■■ 배열 ■■■
- 배열의 선언과 초기화
- 배열의 기본적 활용
======================*/

// 사용자로부터 임의의 학생 수를 입력받고
// 입력받은 학생 수 만큼의 정수(정수 형태)를 입력받아
// 전체 학생 점수의 합, 평균, 편차를 구하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

import java.util.Scanner;

public class Test088
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num, sum=0;
		double avg;
		
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		int[] score = new int[num]; 

		for(int i=0;i<score.length;i++){
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			score[i] = sc.nextInt();
			sum+=score[i];
		}
		
		avg=sum/(double)num;
	
		System.out.println(">> 합 : "+sum);
		System.out.printf(">> 평균 : %.1f\n",avg);
		System.out.println(">> 편차"); 
		
//		for(int i=0;i<score.length;i++){
//			System.out.printf("%d : %.1f\n", score[i], avg-score[i]);
		
//		향상된 for문(forEach 구문)
		
		for(int n : score)
			System.out.printf("%d : %.1f\n", n, n-avg);
		
		}
		
	}
}