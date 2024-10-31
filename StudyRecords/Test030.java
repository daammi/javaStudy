/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
=================================================== 

1. 프로그램을 작성할 때 주어진 조건에 따라
   분기 방향을 정하기 위해 사용되는 제어문에는
   if문 if~else문 조건 연산자 복합if 문, switch문 등이 있다.
   
2. if문은 if 다음의 조건이 참일 경우
   특정 문장을 수행하고자 할 때 사용되는 구문이다.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		int kor, eng, math, tot; 
		double avg;
		char grade;
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사용자로부터 이름을 입력받는다.
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();
		
		// 사용자로부터 국어, 영어, 수학 점수를 입력받는다.
		System.out.print("국어 점수를 입력하세요 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수를 입력하세요 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수를 입력하세요 : ");
	    math = Integer.parseInt(br.readLine());
		
		// 산술 연산을 통해 총점과 평균을 계산한다.
		tot = kor + eng + math;
		avg =  tot / 3.0;
		
		// 등급에 대한 조건검사를 수행한다.
		if(avg>=90)
			grade = 'A';
		else if(avg>=80)
			grade = 'B';
		else if(avg>=70)
			grade = 'C';
		else if(avg>=60)
			grade = 'D';
		else
			grade = 'F';
				
		// 최종 결과 출력		
		System.out.printf("\n당신의 이름은 %s입니다.\n", name);
		System.out.printf("국어 점수는 %d입니다.\n", kor);
		System.out.printf("영어 점수는 %d입니다.\n", eng);
		System.out.printf("수학 점수는 %d입니다.\n", math);	
		System.out.printf("총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf("등급은 %c 입니다\n", grade);
	}
}

// 실행 결과

/*
이름을 입력하세요 : 김정현
국어 점수를 입력하세요 : 90
영어 점수를 입력하세요 : 80
수학 점수를 입력하세요 : 70

당신의 이름은 김정현입니다.
국어 점수는 90입니다.
영어 점수는 80입니다.
수학 점수는 70입니다.
총점은 240이고, 평균은 80.00입니다.
등급은 B입니다
계속하려면 아무 키나 누르십시오 . . .
*/